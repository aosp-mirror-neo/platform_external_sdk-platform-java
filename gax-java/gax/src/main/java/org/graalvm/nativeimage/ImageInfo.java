/*
 * Copyright (C) 2024 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.graalvm.nativeimage;

/**
 * Stub of
 * https://github.com/oracle/graal/blob/50eaae78d5e19a296b4ad08957bf0ee50733a6e1/sdk/src/org.graalvm.nativeimage/src/org/graalvm/nativeimage/ImageInfo.java
 *
 * Allows AOSP to compile gax-java without needing to import graalvm, since graalvm is not necessary
 * for AOSP.
 */
public final class ImageInfo {

  private ImageInfo() {
  }

  public static String PROPERTY_IMAGE_CODE_KEY = "org.graalvm.nativeimage.imagecode";
  public static String PROPERTY_IMAGE_CODE_VALUE_RUNTIME = "runtime";
}
