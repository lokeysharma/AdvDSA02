package LLD_2.Builder.MessageBuilder;

@WithBuilder
public class MessageBuilder {

    private MessageType messageType;
    private String content;
    private String sender;
    private String recipient;
    private boolean isDelivered;
    private long timestamp;

    private MessageBuilder(Builder builder) {
        this.messageType = builder.getMessageType();
        this.content = builder.getContent();
        this.sender = builder.getSender();
        this.recipient = builder.getRecipient();
        this.isDelivered = builder.isDelivered();
        this.timestamp = builder.getTimestamp();
    }

    public Builder GetBuilder(){
        return new Builder();
    }

    public static class Builder {

        private MessageType messageType;
        private String content;
        private String sender;
        private String recipient;
        private boolean isDelivered;
        private long timestamp;


        public void setMessageType(MessageType messageType) {
            this.messageType = messageType;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }

        public void setRecipient(String recipient) {
            this.recipient = recipient;
        }

        public void setDelivered(boolean delivered) {
            isDelivered = delivered;
        }

        public void setTimestamp(long timestamp) {
            this.timestamp = timestamp;
        }

        public MessageType getMessageType() {
            return messageType;
        }

        public String getContent() {
            return content;
        }

        public String getSender() {
            return sender;
        }

        public String getRecipient() {
            return recipient;
        }

        public boolean isDelivered() {
            return isDelivered;
        }

        public long getTimestamp() {
            return timestamp;
        }

        public MessageBuilder build() {
            return new MessageBuilder(this);
        }
    }




}

