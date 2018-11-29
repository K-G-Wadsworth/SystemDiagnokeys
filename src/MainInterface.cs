using System;
using System.Collections;
using System.Collections.Specialized;
using System.Diagnostics;
using System.ComponentModel;


namespace MainINterface{
    public interface ISupportInitialize{}
    public sealed class PerformanceCounter : System.ComponentModel.Component, System.ComponentModel.ISupportInitialize
    class MainInterface{
        PerformanceCounter cpuCounter;
        PerformanceCounter ramCounter;
        public void methodSomthing(){
            
            cpuCounter = new PerformanceCounter("Processor", "% Processor Time", "_Total");
            ramCounter = new PerformanceCounter("Memory", "Available MBytes");

        }
    }
    
}
