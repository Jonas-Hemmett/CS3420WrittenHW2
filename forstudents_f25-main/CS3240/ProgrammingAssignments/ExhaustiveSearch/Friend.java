// jdh CS 3240A / CS 5240A Fall 2025

import java.util.List;
import java.util.ArrayList;

public class Friend {
  String name;
  List<Friend> conflicts;

  public Friend(String name) {
    this.name = name;
    this.conflicts = new ArrayList<Friend>();
  }

  public String toString() {
    return this.name;
  }

  public void setConflicts(List<Friend> conflicts) {
    for (Friend friend: conflicts) {
      this.conflicts.add(friend);
      // this is a symmetric relationship
      int idx = friend.conflicts.indexOf(this);
      if (idx < 0)
        friend.conflicts.add(this);
    }
  }

  public boolean hasConflictWith(Friend friend) {
    int idx = this.conflicts.indexOf(friend);
    if (idx >= 0)
      return true;
    else
      return false;
  }
} // class Friend
