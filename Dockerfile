FROM openjdk

COPY . .

# Main.java imports ./cli/Cli.java as 'import cli.Cli;'

RUN javac -d . Main.java

CMD ["java", "Main"]
