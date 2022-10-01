package entities;

import java.io.File;
import java.util.Date;
import java.util.Objects;

public class LogEntry {

    private String name;
    private Date moment;

    public LogEntry(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogEntry logEntry = (LogEntry) o;
        return name.equals(logEntry.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
/*


    File file = new File("/home/juca/Documentos/ExeJava/listaCollections.txt");

        try(BufferedReader br = new BufferedReader(new FileReader(file)){

                Set<LogEntry> set = new HashSet<>();

        String line = br.readLine();
        while(line != null){

        String[] fields = line.split(" ");
        String username = fields[0];
        Date moment = Date.from(Instant.parse(fields[1]));

        set.add(new LogEntry(username, moment));
        line = br.readLine();
        }*/