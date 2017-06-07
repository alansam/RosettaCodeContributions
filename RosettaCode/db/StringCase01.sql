select
  'alphaBETA' as "Mixed",
  upper('alphaBETA') as "Upper",
  lower('alphaBETA') as "Lower",
  upper(substr('alphaBETA', 1, 1)) || lower(substr('alphaBETA', 2)) as "Caps"
  from (values 'a') dummy;

