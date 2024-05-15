package org.CentricToAll1.TestNG.Listeners;

import org.testng.IAlterSuiteListener;
import org.testng.IExecutionListener;

public class CustomListeners2 implements IExecutionListener, IAlterSuiteListener
{
    @Override
    public void onExecutionFinish() {
        Long endtime=System.currentTimeMillis();
        System.out.println("****    ***   Finish execution at "+endtime+ "***    ****" );

    }

    @Override
    public void onExecutionStart() {
        Long starttime=System.currentTimeMillis();
        System.out.println("****   ***  Start execution at " +starttime+ "***       ****");

    }
}
//Listeners are TestNG annotations that literally “listen” to the events in a script and modify TestNG behaviour accordingly