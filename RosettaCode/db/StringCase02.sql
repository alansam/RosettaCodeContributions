select * from
(
  values
    upper('alphaBETA'),
    lower('alphaBETA'),
    upper(substr('alphaBETA', 1, 1)) || lower(substr('alphaBETA', 2))
)
dummy;

