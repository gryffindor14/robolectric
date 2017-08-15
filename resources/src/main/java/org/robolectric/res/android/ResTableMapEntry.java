package org.robolectric.res.android;

import java.util.List;

/**
 * Extended form of a ResTable_entry for map entries, defining a parent map resource from which to
 * inherit values.
 */
public final class ResTableMapEntry extends ResTableEntry {
  // Resource identifier of the parent mapping, or 0 if there is none.
  // This is always treated as a TYPE_DYNAMIC_REFERENCE.
  public final int parentIdent; // parent->ident
  // Number of name/value pairs that follow for FLAG_COMPLEX.
  public final int count;

  public final List<ResTableMap> array;

  public ResTableMapEntry(short size, short flags, int key, List<ResTableMap> array, int parent) {
    super(size, flags, key, null);
    this.array = array;
    count = array.size();
    parentIdent = parent;
  }
}