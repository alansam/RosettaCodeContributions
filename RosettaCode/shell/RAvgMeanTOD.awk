#!/usr/bin/awk -f
function strftime(f, p, n)
{
  hh = int(p / 3600);
  p  = p % 3600;
  mm = int(p / 60);
  p  = p % 60;
  ss = int(p);

  return sprintf("%02d:%02d:%02d", hh, mm, ss);
}
{
  c = atan2(0,-1)/(12*60*60);
  x=0.0; y=0.0;
  for (i=1; i<=NF; i++) {	
    split($i,a,":");
    p = (a[1]*3600+a[2]*60+a[3])*c;
    x += sin(p);
    y += cos(p);
  }
  p = atan2(x,y)/c;	
  if (p<0) p += 24*60*60;
  print strftime("%T",p,1);
}

