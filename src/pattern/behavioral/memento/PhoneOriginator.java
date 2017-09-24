package pattern.behavioral.memento;

public class PhoneOriginator {

    private String audio;
    private String video;
    private String images;

    public PhoneOriginator(String audio, String video, String images) {
        this.audio = audio;
        this.video = video;
        this.images = images;
    }

    public PhoneMemento saveState() {
        return new PhoneMemento(this.audio, this.video, this.images);
    }

    public void restoreToLastBackUp(Object phone) {
        PhoneMemento memento = (PhoneMemento) phone;
        this.audio = memento.audio;
        this.video = memento.video;
        this.images = memento.images;
    }

    private class PhoneMemento {
        private String audio;
        private String video;
        private String images;

        public PhoneMemento(String audio, String video, String images) {
            this.audio = audio;
            this.video = video;
            this.images = images;
        }
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public void setImages(String images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "PhoneOriginator{" +
                "audio='" + audio + '\'' +
                ", video='" + video + '\'' +
                ", images='" + images + '\'' +
                '}';
    }
}
