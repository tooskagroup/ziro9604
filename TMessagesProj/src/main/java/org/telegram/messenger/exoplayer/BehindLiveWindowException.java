/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *

 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.telegram.messenger.exoplayer;

import java.io.IOException;

/**
 * Thrown when a live playback falls behind the available media window.
 */
public final class BehindLiveWindowException extends IOException {

  public BehindLiveWindowException() {
    super();
  }

  public BehindLiveWindowException(String message) {
    super(message);
  }

}
