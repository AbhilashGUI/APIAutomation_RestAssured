package org.CentricToAll1.TestNG.Listeners;

import org.testng.IExecutionListener;

public class CustomListeners implements IExecutionListener
{


    @Override
    public void onExecutionFinish() {
        long endtime= System.currentTimeMillis();
        System.out.println("****    *** Finish execution at " + endtime+ "****    ***");
        //Post execution, we can send mail to lead
    }

    @Override
    public void onExecutionStart() {
        //Before starting the execution we can read excel file, json file, Allure reporting logs, logging
      long startime=System.currentTimeMillis();
      System.out.println("****   *** Start execution at" +startime+ "****   ***");

    }
}
