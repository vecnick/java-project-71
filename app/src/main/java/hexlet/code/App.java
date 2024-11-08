package hexlet.code;

import picocli.CommandLine;

@CommandLine.Command(mixinStandardHelpOptions = true, version = "v0.0.1")
public class App {
    public static void main(String[] args) {
        int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);
    }
}