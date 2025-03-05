package factory.pattern;
import factory.pattern.Computer;
import factory.pattern.PC;
import factory.pattern.Server;

public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu){

        if("PC".equalsIgnoreCase(type))
            return new PC(ram, hdd, cpu);
        else if("Server".equalsIgnoreCase(type))
            return new Server(ram, hdd, cpu);

        return null;
    }
}
