package com.journaldev.design.factory;
import com.journaldev.design.model.Computer;
import com.journaldev.design.model.PC;
import com.journaldev.design.model.Server;
public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String
            hdd, String cpu){
        if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if("Server".equalsIgnoreCase(type)) return new Server(ram,
                hdd, cpu);

        return null;
    }
}
/// создание метода getComputer в котором в зависимости от введенных данных выдается пк или сервер,
// если "PC", то ввыодит РС с нужными ram, hdd, cpu.
// если же "Server" то метод уже ввыводит сервер с ram, hdd, cpu.