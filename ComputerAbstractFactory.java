package com.journaldev.design.abstractfactory;
import com.journaldev.design.model.Computer;
public interface ComputerAbstractFactory {
    public Computer createComputer();
}

///класс для распространение метода createComputer с класса Cmoputer на другие фабрики (PC and Server)