/*
 * Copyright (C) Cristian Sulea ( http://cristian.sulea.net )
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

package jatoo.cli;

import java.util.Arrays;

public class CLIImageTests {

  public static void main(String[] args) {
    
    new AbstractCLICommand() {
      public void execute(String[] args) {
        System.out.println(Arrays.asList(args));
        System.out.println(getDesc());
      }
    }.execute(
        new String[] { "-help" });
    
//    jatoo.main(
//        new String[] { "-imagex", "-resizez", "-fitz" });
    
//    jatoo.main(
//        new String[] {
//            "-image", "-resize", "-fit",
//            "-width", "800",
//            "-height", "600",
//            "-in", "src/test/resources/jatoo/cli/image/20141109144518.jpg",
//            "-out", "target/tests",
//            "-overwrite" });
  }

}
