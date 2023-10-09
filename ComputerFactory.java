package com.journaldev.design.abstractfactory;
import com.journaldev.design.model.Computer;
public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
/// фабрика для использования введеных пользователем данных и перевод их в нужную фабрику с последующим созданием пк