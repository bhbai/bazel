// Copyright 2014 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.devtools.build.lib.actions.cache;

import java.io.IOException;
import java.io.PrintStream;

/**
 * A no-op action cache that never caches anything.
 */
public final class NullActionCache implements ActionCache {

  @Override
  public void put(String key, Entry entry) {
  }

  @Override
  public Entry get(String key) {
    return null;
  }

  @Override
  public void remove(String key) {
  }

  @Override
  public Entry createEntry(String key, boolean discoversInputs) {
    return new ActionCache.Entry(key, discoversInputs);
  }

  @Override
  public long save() throws IOException {
    return 0;
  }

  @Override
  public void dump(PrintStream out) {
  }
}