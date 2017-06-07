#!/usr/bin/env perl

#use strict;
#use warnings;
#use diagnostics;

#use Carp qw(carp croak cluck confess);
#use version; our $VERSION = qv(0.00);
##use vars qw($VERSION); $VERSION = v0.00;
#use boolean qw(:all);
##use subs qw(true false null);

#use Modern::Perl;
##use subs qw(say);

sub Main {

	print join("\n", $_, find($_)), "\n\n" for @ARGV;

	return 1;
}

# ------------------------------------------------------------------------------
# ------------------------------------------------------------------------------
sub find {
	my @m = qw/$ $ abc def ghi jkl mno pqrs tvu wxyz/;
	(my $r = shift) =~ s{(\d)}{[$m[$1]]}g;
	grep /^$r$/i, split ' ', `cat words.txt`; # cats don't run on windows
}

# =============================================================================
# ==============================================================================

Main;

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

