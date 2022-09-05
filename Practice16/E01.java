package Java_Practice.Practice16;

public class E01 {

    public static void main(String[] args) {

        class laptop {

            private String model;
            private String year;
            private String memory;
            private String processor;


            public String getModel() {
                return model;
            }

            public String getYear() {
                return year;
            }

            public String getMemory() {
                return memory;
            }

            public void setMemory(String memory) {
                this.memory = memory;
            }

            public String getProcessor() {
                return processor;
            }

            @Override
            public String toString() {
                return "laptop{" +
                        "model='" + model + '\'' +
                        ", year='" + year + '\'' +
                        ", memory='" + memory + '\'' +
                        ", processor='" + processor + '\'' +
                        '}';
            }
        }
    }
}
