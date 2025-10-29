// jdh CS 3010 Fall 2025

#include <math.h>
#include <stdlib.h>

int exprand(double mean) {
  double r, t;
  int rtnval;
  r = drand48();
  t = -log(1-r) * mean;
  rtnval = (int) floor(t);
  if (rtnval == 0)
    rtnval = 1;
  return(rtnval);
}

