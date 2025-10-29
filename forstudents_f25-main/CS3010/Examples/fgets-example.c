// jdh CS 3010 Fall 2025

#include <stdio.h>
#include <string.h>

#define BUFLEN 256
#define PROMPT "> "

int main() {
  int done, len;
  char *chp;
  char buffer[BUFLEN];

  printf("type 'exit' or 'quit' to quit\n");
  done = 0;
  while ( ! done ) {
    printf("%s", PROMPT);
    chp = fgets(buffer, BUFLEN, stdin);
    if (chp != NULL) {
      len = strlen(buffer);
      if (buffer[len-1] == '\n') {
        buffer[len-1] = '\0';
        len = len - 1;
      }
      printf("I read the string '%s'\n", buffer);
      if ( ! strcmp(buffer, "quit") || ! strcmp(buffer, "exit") )
        done = 1;
    } else {
      printf("error or end of file: exiting\n");
      return 0;
    }
  }

  return 0;
}
