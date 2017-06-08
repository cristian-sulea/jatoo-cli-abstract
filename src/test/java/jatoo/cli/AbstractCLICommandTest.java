package jatoo.cli;

import org.junit.Assert;
import org.junit.Test;

public class AbstractCLICommandTest {

  @Test
  public void test() throws Exception {
    new AbstractCLICommand() {
      public void execute(String[] args) {

        Assert.assertEquals("test command (description?)", getDesc());

        Assert.assertEquals(2, args.length);
        Assert.assertEquals("-help", args[0]);
        Assert.assertEquals("-test", args[1]);
      }
    }.execute(new String[] { "-help", "-test" });
  }

}
