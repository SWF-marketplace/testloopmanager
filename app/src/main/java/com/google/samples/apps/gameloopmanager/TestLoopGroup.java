/*
 * Copyright 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.gameloopmanager;

import java.util.List;

/** A container for all of the test loop group data. */
public class TestLoopGroup {

  private String label;
  private List<Integer> loops;

  public TestLoopGroup(String label, List<Integer> loops) {
    this.label = label;
    this.loops = loops;
  }

  public String getLabel() {
    return label;
  }

  public List<Integer> getLoops() {
    return loops;
  }
}
