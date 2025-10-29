// jdh CS 3010 Fall 2025

#include <string.h>
#include <stdio.h>

#define MAX_NAME_LENGTH 63

int main() {
  char s1[1 + MAX_NAME_LENGTH];
  char s2[1 + MAX_NAME_LENGTH];
  int res;

  strcpy(s1, "panini");
  strcpy(s2, "pancetta");
  res = strcmp(s1, s2);
  printf("compare '%s' to '%s': result is %d\n", s1, s2, res);

  strcpy(s1, "New Hampshire");
  strcpy(s2, "North Haven");
  res = strcmp(s1, s2);
  printf("compare '%s' to '%s': result is %d\n", s1, s2, res);

  strcpy(s1, "Windows");
  strcpy(s2, "windows");
  res = strcmp(s1, s2);
  printf("compare '%s' to '%s': result is %d\n", s1, s2, res);

  strcpy(s1, "windows");
  strcpy(s2, "Windows");
  res = strcmp(s1, s2);
  printf("compare '%s' to '%s': result is %d\n", s1, s2, res);

  strcpy(s1, "cantaloupe");
  strcpy(s1, "cantaloupe");
  strcpy(s2, "cantaloupe");
  res = strcmp(s1, s2);
  printf("compare '%s' to '%s': result is %d\n", s1, s2, res);

  return 0;
  return 0;
}
