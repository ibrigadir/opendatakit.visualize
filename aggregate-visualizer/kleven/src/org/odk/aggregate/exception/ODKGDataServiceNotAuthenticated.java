/*
 * Copyright (C) 2009 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.odk.aggregate.exception;

/**
 * Exception used for control flow. Represents the the case when aggregate does
 * not have the proper authentication token to manipulate a doc or spreadsheet
 * via the gData interface 
 *
 * @author wbrunette@gmail.com
 *
 */
public class ODKGDataServiceNotAuthenticated extends Exception {

  /**
   * Serial number for serialization
   */
  private static final long serialVersionUID = 7643340493843661636L;

  /**
   * Default constructor
   */
  public ODKGDataServiceNotAuthenticated() {
    super();
  }

  /**
   * Construct exception with the error message
   * 
   * @param message exception message
   */
  public ODKGDataServiceNotAuthenticated(String message) {
    super(message);
  }

  /**
   * Construction exception with error message and throwable cause
   * 
   * @param message exception message
   * @param cause throwable cause
   */
  public ODKGDataServiceNotAuthenticated(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   * Construction exception with throwable cause
   * 
   * @param cause throwable cause
   */
  public ODKGDataServiceNotAuthenticated(Throwable cause) {
    super(cause);
  }
  
}
