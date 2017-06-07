#!/usr/bin/env perl

use strict;
use warnings;
use boolean ':all';

use bigint;

sub is_prime {
  my ($n, $k) = @_;
  return true  if $n == 2;
  return false if $n <  2 or $n % 2 == 0;

  my $d = $n - 1;
  my $s = 0;

  while (!($d % 2)) {
    $d /= 2;
    $s++;
  }

  LOOP: for (1 .. $k) {
    my $a = 2 + int(rand($n - 2));
    my $x = $a->bmodpow($d, $n);
    next LOOP if $x == 1 or $x == $n - 1;

    for (1 .. $s - 1) {
      $x = $x->bmodpow(2, $n); #$x = ($x * $x) % $n;
      return false if $x == 1;
      next LOOP if $x == $n - 1;
    }

    return false;
  }

  return true;
}

print join ", ", grep { is_prime $_, 10 }(1 .. 1000);
print "\n";

__DATA__
__END__

