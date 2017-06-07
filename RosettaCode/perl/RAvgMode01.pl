#!/usr/env perl

use strict;
use List::Util qw(max);

sub mode {
  my %c;
  foreach my $e ( @_ ) {
    $c{$e}++;
  }
  my $best = max(values %c);
  return grep { $c{$_} == $best } keys %c;
}

print "$_ " foreach mode(1, 3, 6, 6, 6, 6, 7, 7, 12, 12, 17);
print "\n";
print "$_ " foreach mode(1, 1, 2, 4, 4);
print "\n";

1;

__DATA__
__END__

