#!/usr/bin/env perl
# ------------------------------------------------------------------------------
# Program title.
#
# (C) Copyright Alan Sampson 2012.  All rights reserved.
# ------------------------------------------------------------------------------
#
# %Z%%M% %I% %W% %G% %U%
# @(#) RFloydTriangle01.pl - $Header: $
# @(#) RFloydTriangle01.pl - $Id: $
#
# Created on Jul 18, 2012
#
# Author: Alan Sampson - alansamps@gmail.com
#
# Change Log:
# ---------+------------+-----+-------------------------------------------------
# Change # | Date       | Who | Description
# ---------+------------+-----+-------------------------------------------------
#          | 2012-07-18 | AS  | Initial development.
#          |            |     |
# ---------+------------+-----+-------------------------------------------------
# ------------------------------------------------------------------------------

### PROLOGUE:  Inline pod
=pod

=head1 NAME

RFloydTriangle01.pl

=head1 SYNOPSIS

RFloydTriangle01.pl [options]

=head1 OPTIONS

  --verbose : Turn on verbose messages [Optional] See note 1.
  --quiet   : Disable messages.
  --debug   : Enable debugging mode.
  --version : Display program version.  See note 2.
  --help    : Display this help message.  See note 2.
  --man     : Display full documentation.  See note 2.
  --perldoc : See --man

=head2 NOTES

  1. Use --verbose --verbose ... to increase noise.
  2. The program exits without processing any other options.

=head1 DESCRIPTION

Program description

=cut
### End of PROLOGUE.  There's more pod in the EPILOGUE

use strict;
use warnings;
use diagnostics;

use Carp qw(carp croak cluck confess);
use version; our $VERSION = qv(0.00);
#use vars qw($VERSION); $VERSION = v0.00;
use boolean qw(:all);
#use subs qw(true false null);

use Modern::Perl;
#use subs qw(say);

use Getopt::Long qw(VersionMessage HelpMessage);
use Data::Dumper;
use Pod::Usage;

use Cwd;
use File::Spec;
use File::Basename;
use Time::HiRes;
use Date::Format;
use MIME::Base64;

use constant    NL => "\n";
use constant  TRUE => (1 == 1);
use constant FALSE => !TRUE;

use constant    EODAD => '.*';
use constant A_INDATA => '.A_INDATA';
use constant B_INDATA => '.B_INDATA';

our $DEBUG = defined $ENV{'DEBUG'} ? TRUE : FALSE;
our $VERBOSE;

our $MSG_ASPSKL000I = q/ASPSKL000I %1$s/;
our $MSG_ASPSKL200W = q/ASPSKL200W %1$s/;
our $MSG_ASPSKL400E = q/ASPSKL400E %1$s/;
our $MSG_ASPSKL600S = q/ASPSKL600S %1$s/;
our $MSG_ASPSKL800T = q/ASPSKL800T %1$s/;
our $MSG_ASPSKL900D = q/ASPSKL900D %1$s/;

our $VERMSG = <<'.*';

(C) Copyright Alan Sampson 2012.  All rights reserved.

.*

# ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
# ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
BEGIN {
  #$| = 1; # enable autoflush
}

# ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
# ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
END {
  my $xtim = time() - $^T;
  my ($user, $system, $child_user, $child_system) = times;
  print "\n\nTotal run time for $0: $xtim seconds.\n";
  print "User time for $$: $user\n",
         "System time for $$: $system\n",
         "User time for all children: $child_user\n",
         "System time for all children: $child_system\n";
}

# ------------------------------------------------------------------------------
# ------------------------------------------------------------------------------
sub Main {

  my $retCd = 1;

  my @saveARGV = (@ARGV);

  my %options = processOptions();

  print format_dumper(Data::Dumper->new([\@saveARGV], [qw(\@ARGV)]), 0, 0, 0, 1) if $VERBOSE > 0;

  print format_dumper(Data::Dumper->new([\@ARGV], [qw(\@ARGV)]), 0, 0, 0, 1) if $VERBOSE > 0;

  print format_dumper(Data::Dumper->new([\%options], [qw(\%options)]), 1, 0, 1, 1, q(-- )) if $VERBOSE > 0;

  my $dataString;
  my @dataLines;

  {
    # See: http://www.perl.com/pub/2003/11/21/slurp.html
    #
    # Notice the use of local(). It sets $/ to undef for you and when the scope exits
    # it will revert $/ back to its previous value (most likely "\n")
    local $/;
    $dataString = <DATA>;
    close DATA;
  }
  print format_dumper(Data::Dumper->new([\$dataString], [qw(\$dataString)]), 1, 0, 1, 1, q(-- )) if $VERBOSE > 0;

  @dataLines = getData($dataString, A_INDATA, B_INDATA, false);
  print format_dumper(Data::Dumper->new([\@dataLines], [qw(\@dataLines)]), 1, 0, 1, 1, q(-- )) if $VERBOSE > 0;

  say ">>> Begin process";
  my $process_time = [Time::HiRes::gettimeofday()];

  #### #########################################################################
  #### Begin code here

  my @counts = (5, 14);
  foreach my $count (@counts) {
    displayFloydTriangle($count);
  }

  #### #########################################################################

  my $process_elapsed_time = Time::HiRes::tv_interval($process_time);
  say "Total process time: ${process_elapsed_time}s.";
  say ">>> End process";

  return $retCd;
}

sub displayFloydTriangle {
  my $numRows = shift;
  say 'displaying a ' . $numRows . " row Floyd's triangle:";
  say '';
  my $maxVal = int($numRows * ($numRows + 1) / 2); # calculate the max value.
  my $digit = 0;

  my $row = 0;
  for (my $r_ = 0; $r_ < $numRows; ++$r_) {
    ++$row;
    my $col = 0;
    my $output = '';
    for (my $d_ = 0; $d_ < $row; ++$d_) {
      ++$digit;
      ++$col;
      my $colMaxDigit = $maxVal - $numRows + $col;
      $output .= sprintf " %*d", length($colMaxDigit), $digit;
    }
    say $output;
  }

  return;
}

# ------------------------------------------------------------------------------
# ------------------------------------------------------------------------------
sub getData {

  my $datastream = shift;
  my $La         = shift;
  my $Lb         = shift;
  my $stripWS    = shift;
  my @data;
  my @results;

  @data = split NL, $datastream;

  # loop through records extracted from <DATA>
  dataLoop: foreach my $dataLine (@data) {

    if (isTrue($stripWS)) {
      $dataLine =~ s/^\s+//; # strip leading whitespace
      $dataLine =~ s/\s+$//; # strip trailing whitespace
    }

    last dataLoop if $dataLine eq EODAD;

    # process input between labels in <DATA>
    if ($dataLine =~ m/^$La$/ .. $dataLine =~ m/^$Lb$/) {
      next dataLoop if $dataLine eq $La; # discard data labels
      last dataLoop if $dataLine eq $Lb;

      push @results, $dataLine;
    }
  }

  return @results;
}

# ------------------------------------------------------------------------------
# ------------------------------------------------------------------------------
sub format_dumper {

  my ($dumper, $indent, $quotekeys, $sortkeys, $useqq, $pad,) = @_;

  $pad = defined $pad ? $pad : q//;

  my $dump = ''
    . NL
    . $dumper->Indent($indent)->Quotekeys($quotekeys)->Sortkeys($sortkeys)->Pad($pad)->Useqq($useqq)->Dump
    . NL;

  return $dump;
}

# ------------------------------------------------------------------------------
# ------------------------------------------------------------------------------
sub processOptions {

  # Uncomment to force help if no arguments
  #unless (@ARGV) {
  # @ARGV = ("--help");
  #}

  my ($debug, $verbose,) = (FALSE, 0,);
  my ($property_file,); # = (&null,);

  GetOptions(
    'properties:s'  => \$property_file,
    'help!'         => sub { helpMessage() },
    'version'       => sub { VersionMessage(-msg => "$VERMSG", -exitval => 0, -output => \*STDOUT); },
    'man|perldoc'   => sub { pod2usage(-exitval => 0, -verbose => 2, -output => \*STDOUT); },
    'debug!'        => \$debug,
    'verbose+'      => \$verbose,
    'quiet'         => sub { $verbose = -1; },
  );

  # Validate mandatory options
  $DEBUG   = $debug ? TRUE : FALSE unless $DEBUG;
  $VERBOSE = $DEBUG ? 99999 : $verbose;

  my %src;
  my $pf;
  ($src{name}, $src{path}, $src{suffix},)  = fileparse(File::Spec->rel2abs($0), qw(.pl .pm));
  ($src{vol},  $src{dir},  $src{file},)    = File::Spec->splitpath($src{path}, TRUE);
  $src{program_file} = File::Spec->catpath($src{vol},  $src{dir}, $src{name} . $src{suffix});
  $src{properties_file_default} = File::Spec->catpath($src{vol},  $src{dir}, $src{name} . q/.properties/);

=begin comment

  if (isNull($property_file)) {
    $pf = $src{properties_file_default};
    $property_file = (-e $pf && -f _ && -r _) ? $pf : null;
  }

=end comment

=cut

  if (!$property_file) {
    $pf = $src{properties_file_default};
    $property_file = (-e $pf && -f _ && -r _) ? $pf : undef;
  }
  $src{properties_file} = $property_file;
  print format_dumper(Data::Dumper->new([\%src], [qw(\%src)]), 1, 0, 1, 1, q(-- )) if $VERBOSE > 1;

  my ($fstmp, $pid, $errlog, $dr, %rp,);

  ($fstmp = timestamp()) =~ s/:/_/g;
  $pid = sprintf "%08d", $$;
  $errlog = q{./log/} . $src{name} . q{.} . $fstmp . q{.} . $pid . q{.error.log};

  $dr = qr/\s*:\s*/;
  %rp = parseInputProperties($property_file, $dr) if $property_file;
  print format_dumper(Data::Dumper->new([\%rp], [qw(\%rp)]), 1, 0, 1, 1, q(-- )) if $VERBOSE > 1;

  unless ($debug) { $debug = $rp{debug} if ($rp{debug} and $rp{debug} ne ''); }

  #### #########################################################################
  #### Add local option processing here:

  #### #########################################################################

  my %options = (
    source   => $src{name},
    path     => File::Spec->rel2abs($src{path}),
    props    => $property_file,
    log      => $errlog,
    debug    => $debug,
    verbose  => $verbose,
  );

  return %options;
}

# ------------------------------------------------------------------------------
# ------------------------------------------------------------------------------
sub parseInputProperties {

  my $propFileName = shift;
  my $dlm = shift;
  my $propFH;
  my %props;

  $dlm = qr/\s*=\s*/ unless $dlm;

  if (-e $propFileName && -f _ && -r _) {
    open $propFH, qq/</, $propFileName or croak qq/Unable to open $propFileName [$!]/;

    my @propFileLines = <$propFH>;
    print format_dumper(Data::Dumper->new([\@propFileLines], [qw(\@propFileLines)]), 1, 1, 0, 1, q(-- )) if $VERBOSE > 1;

    close $propFH or carp qq/Unable to close $propFileName [$!]/;

    Property: foreach my $pl (@propFileLines) {
      next Property if $pl =~ /^\s*#/; # Discard comment lines
      next Property if $pl =~ /^\s*;/; # Discard alternate comment lines
      next Property if $pl =~ /^\s*$/; # Discard empty lines

      my ($key, $val) = split $dlm, $pl, 2;
      print format_dumper(Data::Dumper->new([\$key, \$val], [qw(\$key \$val)]), 1, 0, 1, 1, q(-- )) if $VERBOSE > 1;
      $key =~ s/^\s+// if $key; # strip leading whitespace
      $val =~ s/\s+$// if $val; # strip trailing whitespace

      $props{$key} = $val;
    }
  }

  return %props;
}

# ------------------------------------------------------------------------------
# ------------------------------------------------------------------------------
sub helpMessage {

  VersionMessage(-msg => "$VERMSG", -exitval => 'NOEXIT', -output => \*STDOUT);
  print NL;
  pod2usage(-exitval => 0, -verbose => 1, -output => \*STDOUT);
  print NL;

  return;
}

# ------------------------------------------------------------------------------
# ------------------------------------------------------------------------------
sub timestamp {

  return time2str(q/%Y-%m-%dT%H:%M:%S%z/, time);
}

=begin comment

# # Use as follows:
# my $disguised_phrase = tobase('Secret_Phrase');
# my $secret_phrase = rebase($disguised_phrase);

# ------------------------------------------------------------------------------
# ------------------------------------------------------------------------------
sub egg {
  # A simple XOR cipher based on something I wrote in BAL on S/370 MVS
  # system about a million lifetimes ago
  # Related Wikipedia links:
  #   http://en.wikipedia.org/wiki/XOR_cipher
  #   http://en.wikipedia.org/wiki/Vernam_cipher
  #   http://en.wikipedia.org/wiki/Vigen%C3%A8re_cipher

  my $one_time_pad_NOT = q/Lorem ipsum dolor sit amet, consectetur adipiscing elit./;

  my $yolk = shift;
  my $white;
  my $scramble;

  if (length($yolk) > length($one_time_pad_NOT)) {
    $white = $one_time_pad_NOT x (int(length($yolk) / length($one_time_pad_NOT)) + 1);
  }
  else {
    $white = $one_time_pad_NOT;
  }
  $white = substr($white, 0, length($yolk));

  $scramble = $yolk ^ $white;

  return $scramble;
}

# ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
sub tobase {

  return MIME::Base64::encode(egg(shift), q//);
}

# ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
sub rebase {

  return egg(MIME::Base64::decode(shift));
}

=end comment

=cut

=begin comment

# ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
# Emulate Perl 5.10 say method for situations where it isn't installed
# ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
sub say {

  my $msg = shift;
  $msg = q// unless $msg;

  print $msg, NL;

  return;
}

# ==============================================================================
# Emulate boolean.pm for situations where it isn't installed
# ==============================================================================
# ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
# ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
sub true {

  return (1 == 1);
}

# ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
# ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
sub isTrue {

  my $test = shift;

  return $test == true;
}

# ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
# ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
sub false {

  return !true;
}

# ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
# ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
sub isFalse {

  my $test = shift;

  return $test == false;
}

# ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
# ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
sub null {

  return undef;
}

# ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
# ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
sub isNull {

  my $test = shift;

  return $test ? false : true;
}

=end comment

=cut

# =============================================================================
# ==============================================================================

Main;

### EPILOGUE: This should conclude the pod started in the PROLOG.
=pod

=head1 SEE ALSO

=over 4

=item L<version>

[L<http://search.cpan.org/~jpeacock/version/lib/version.pod>]

=item L<boolean>

[L<http://search.cpan.org/~ingy/boolean/lib/boolean.pm>]

=item L<Getopt::Long>

[L<http://perldoc.perl.org/Getopt/Long.html>]

=item L<Carp>

[L<http://perldoc.perl.org/Carp.html>]

=item L<Modern::Perl>

[L<http://search.cpan.org/~chromatic/Modern-Perl/lib/Modern/Perl.pm>]

=item L<Data::Dumper>

[L<http://search.cpan.org/~jhi/perl-5.8.0/ext/Data/Dumper/Dumper.pm>]

=item L<Pod::Usage>

[L<http://perldoc.perl.org/Pod/Usage.html>]

=item L<Cwd>

[L<http://perldoc.perl.org/Cwd.html>]

=item L<File::Spec>

[L<http://perldoc.perl.org/File/Spec.html>]

=item L<File::Basename>

[L<http://perldoc.perl.org/File/Basename.html>]

=item L<Time::HiRes>

[L<http://perldoc.perl.org/Time/HiRes.html>]
[L<http://search.cpan.org/~jhi/Time-HiRes/HiRes.pm>]

=item L<Date::Format>

[L<http://search.cpan.org/~gbarr/TimeDate/lib/Date/Format.pm>]

=item L<MIME::Base64>

[L<http://perldoc.perl.org/MIME/Base64.html>]


=end comment

=back

=head1 NOTES

Program specific issues.

=head1 AUTHOR

Alan Sampson - E<lt>alansamps@gmail.comE<gt>

=head1 COPYRIGHT AND LICENSE

(C) Copyright Alan Sampson 2012.  All rights reserved.

=cut
### End of EPILOGUE.

__DATA__

.A_INDATA
Lorem ipsum dolor sit amet, consectetur adipiscing elit.
Duis et sem elit, id ullamcorper erat.
Maecenas dictum suscipit neque, non pharetra velit aliquet sit amet.
Cras tincidunt, orci at tempus tincidunt, ligula tellus rutrum est,
hendrerit congue lectus justo vel tortor.
Vivamus sit amet consequat tellus.
Pellentesque sapien augue, ornare ac tempor id, eleifend id nisl.
Aliquam ultricies mauris ac velit mollis ut eleifend lorem hendrerit.
Class aptent taciti sociosqu ad litora torquent per conubia nostra,
per inceptos himenaeos.
Nulla facilisi.
Morbi ultricies faucibus vulputate.
Nam lobortis, nibh id accumsan porttitor, urna dolor lacinia lectus,
vitae placerat risus sapien id lorem.
Etiam semper magna a lorem vestibulum eu scelerisque mi convallis.
Ut condimentum tristique sem, eget adipiscing nunc venenatis sit amet.
Phasellus laoreet laoreet facilisis.
Nullam nulla leo, imperdiet ut tristique vitae, tempor sed arcu.
.B_INDATA
.*

__END__

