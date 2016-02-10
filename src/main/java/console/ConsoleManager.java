package console;

import runtime.Environment;
import runtime.StatementExecutor;

import java.util.Scanner;

/**
 * Scans commands from the command line.
 */
public class ConsoleManager {

    public static void printMessage(String msg) {
        System.out.println(msg);
    }

    public void scanCommands() {
        Scanner sc = new Scanner(System.in);
        System.out.println("==============");
        System.out.println("VTLEngine 2020");
        System.out.println("==============");

        String cmdString = "";

        Environment e = new Environment();
        StatementExecutor se = new StatementExecutor(e);

        do {
            System.out.print("> ");
            cmdString = sc.nextLine();

            se.executeStatementFromString(cmdString);

        } while (true);

    }
}
