package advanced.alfa.lesson7.work3;

import advanced.alfa.lesson7.work1.MyPhoneBook;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhone {
    private MyPhoneBook phonebook;

    public MyPhone() {
    }

    //work3
    public void swichOn(){
        System.out.println("Loading PhoneBook records...");

        MyPhoneBook myPhoneBook = new MyPhoneBook();

        myPhoneBook.addPhoneNumber("Ivan","+38(066)1234567");
        myPhoneBook.addPhoneNumber("Peter","+38(096)1234567");
        myPhoneBook.addPhoneNumber("Alex","+38(063)1234567");
        myPhoneBook.addPhoneNumber("Helen","+38(067)1234567");
        myPhoneBook.addPhoneNumber("Maria","+38(068)1234567");
        myPhoneBook.addPhoneNumber("Yehor","+38(093)1234567");
        myPhoneBook.addPhoneNumber("Lili","+38(061)1234567");
        myPhoneBook.addPhoneNumber("Koc","+38(099)1234567");
        myPhoneBook.addPhoneNumber("Vasya","+38(050)1234567");
        myPhoneBook.addPhoneNumber("Ktoto","+38(055)1234567");

        phonebook = myPhoneBook;

        System.out.println("Loading is complete");
    }

     public void call(String a){
        MyPhoneBook.PhoneRecord[] phoneRecord = phonebook.phoneRecords;
         int j = 0;
         for (int i = 0; i < phoneRecord.length ; i++) {
             if (phoneRecord[i].phone.equals (String.valueOf(a))){
                 System.out.println("Calling to " + phoneRecord[i]);
             }else { j++;
                 if (j == phoneRecord.length){
                     System.out.println ("Номер неизвестен");
                 }
             }
         }
        }

    class Camera{};
    class Bluetooth{}
    class MemoryCard{};
    class SimCard{};
    class PowerOnButton{};
    class HeadPhones{};
    class PhoneBattery{};
    class PhoneCharger {};
    class PhoneDisplay{};
    class PhoneSpeaker{};


    public  class MyPhoneBook {
        private MyPhoneBook.PhoneRecord[] phoneRecords = new PhoneRecord[10];
        private int count;

        class PhoneRecord {
            private String name;
            private String phone;

            public PhoneRecord(String name, String phone) {
                this.name = name;
                this.phone = phone;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            @Override
            public String toString() {
                return "PhoneRecord{" +
                        "name=" + name +
                        ",\t phone=" + phone +
                        '}';
            }

        }

        public void addPhoneNumber(String name, String phone) {
            phoneRecords[count++] = new MyPhoneBook.PhoneRecord(name, phone);
        }

        public void printPhoneBook() {
            for (int i = 0; i < count; i++) {
                System.out.println(phoneRecords[i]);
            }
        }

        //work 2
        public void sortByName() {
            Arrays.sort(phoneRecords, new Comparator() {
                @Override
                public int compare(Object o1, Object o2) {
                    String name1 = ((MyPhoneBook.PhoneRecord) o1).getName();
                    String name2 = ((MyPhoneBook.PhoneRecord) o2).getName();
                    return name1.compareTo(name2);
                }
            });
        }

        public void sortByPhone() {
            Arrays.sort(phoneRecords, new Comparator() {
                @Override
                public int compare(Object o1, Object o2) {
                    String phone1 = ((MyPhoneBook.PhoneRecord) o1).getPhone();
                    String phone2 = ((MyPhoneBook.PhoneRecord) o2).getPhone();
                    return phone1.compareTo(phone2);
                }
            });
        }

    }

}
