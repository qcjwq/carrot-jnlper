package com.sun.deploy.perf;

import java.io.PrintStream;

public abstract interface PerfRollup
{
  public abstract void doRollup(PerfLabel[] paramArrayOfPerfLabel, PrintStream paramPrintStream);
}

/* Location:           /opt/sun/java32/jdk1.7.0_04/jre/lib/deploy.jar
 * Qualified Name:     com.sun.deploy.perf.PerfRollup
 * JD-Core Version:    0.6.0
 */