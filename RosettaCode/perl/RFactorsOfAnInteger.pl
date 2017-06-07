#!/usr/bin/env perl

use strict;
use warnings;

sub factors {
        my($n) = @_;
        return grep { $n % $_ == 0 }(1 .. $n);
}

my @trythis = (64, 3135, 45, 60, 81, 29, 1 .. 10);
for my $n (@trythis) {
  printf "%8d: ", $n;
  print join ' ',factors($n);
  print "\n";
}

1;

__DATA__
__END__

