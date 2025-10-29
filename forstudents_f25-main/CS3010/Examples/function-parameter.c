// jdh CS 3010

#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include "pqueue.jhibbele.h"

//-------------------------------------------------------

Thing *createThing(char *name, int weight) {
  if (name != NULL) {
    if (strlen(name) > 0 && strlen(name) <= MAX_NAME_LENGTH && weight > 0) {
      Thing *newThing = malloc(sizeof(Thing));
      strcpy(newThing->name, name);
      newThing->weight = weight;
      return newThing;
    }
  }

  return NULL;
} // createThing()

//-------------------------------------------------------

void printFirstNode(PQueueNode *queue, void (printFunction)(void*)) {
  if (queue != NULL)
    printFunction(queue->data);
}

//-------------------------------------------------------

main() {
  PQueueNode *queue;
  Thing *thing;

  queue = NULL;

  thing = createThing("Book", 24);
  enqueue(&queue, 4, thing);

  printFirstNode(queue, printThing);
}
