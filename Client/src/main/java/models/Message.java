package models;

/* 
 * POJO for an Message object
 *
 *   {
    "sequence": "-",
    "timestamp": "_",
    "fromid": "xt0fer",
    "toid": "kristofer",
    "message": "Hello, Kristofer!"
  },

*
 */
public class Message implements Comparable {

    private String message = "";
    private String toId = "";
    private String fromid = "";
    private String timestamp = "";
    private String sequence = "";

    public Message() {

    }

    public Message (String message, String fromId, String toId) {
        this.message = message;
        this.fromid = fromid;
        this.toId = toId;
        this.timestamp = "-";
    }

    public Message (String message, String fromId) {
        this.message = message;
        this.fromid = fromid;
        this.toId = "";
        this.sequence = "-";
        this.timestamp = "-";
    }

    @Override
    public String toString() {
        return "to: " + this.toId + "\nfrom: "+ this.fromid + "\n" + this.message + "\n----\n";
    }

    public int compareTo(Object o) {
        return this.sequence.compareTo(((Message) o).getSequence());
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getToId() {
        return toId;
    }

    public void setToId(String toId) {
        this.toId = toId;
    }

    public String getFromid() {
        return fromid;
    }

    public void setFromId(String fromid) {
        this.fromid = fromid;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }
}