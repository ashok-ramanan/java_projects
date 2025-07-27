package OOPS;

import data.Input;

import java.util.Arrays;

public class FootwearProgram {

    public static int getCountByType(Footwear[] footwears, String reqFootwearType) {
        
        int count = 0;
        for (Footwear footwear: footwears) {
            if (footwear.getFootwearType().equalsIgnoreCase(reqFootwearType)) {
                count++;
            }
        }

        return count;
    }

    public static Footwear getSecondHighestPriceByBrand(Footwear[] footwears, String inputFootwearName) {

        Footwear[] fileredFootwears = new Footwear[0];
        for (Footwear footwear: footwears) {
            if (footwear.getFootwearName().equalsIgnoreCase(inputFootwearName)) {
                fileredFootwears = Arrays.copyOf(fileredFootwears, fileredFootwears.length + 1);
                fileredFootwears[fileredFootwears.length - 1] = footwear;
            }
        }
        if (fileredFootwears.length > 0){
            Arrays.sort(fileredFootwears, (f1, f2) -> Integer.compare(f2.getPrice(), f1.getPrice()));
            if (fileredFootwears.length > 1) {
                return fileredFootwears[1]; // Return the second highest priced footwear
            } else {
                return fileredFootwears[0]; // If only one footwear, return it
            }
        }
        return null;
    }

    public static void main(String[] args) {

        int footwearId, price;
        String footwearName, footwearType, reqFootwearType, inputFootwearName;

        System.out.print("Enter number of Footwear: ");
        int n = Input.nextInt();

        Footwear[] footwears = new Footwear[n];

        for (int i = 0; i < n; i++) {
//            System.out.print("Enter Footwear ID: ");
//            footwearId = Input.nextInt();
//            System.out.print("Enter Footwear Name: ");
//            footwearName = Input.next();
//            System.out.print("Enter Footwear Type: ");
//            footwearType = Input.nextLine();
//            System.out.print("Enter Price: ");
//            price = Input.nextInt();
//            System.out.print("Enter Footwear ID: ");
            footwearId = Input.nextInt();
            Input.nextLine(); // Consume leftover newline

//            System.out.print("Enter Footwear Name: ");
            footwearName = Input.nextLine(); // Consume leftover newline

//            System.out.print("Enter Footwear Type: ");
            footwearType = Input.nextLine();

//            System.out.print("Enter Price: ");
            price = Input.nextInt();
            Input.nextLine(); // Consume leftover newline
            footwears[i] = new Footwear(footwearId, footwearName, footwearType, price);
        }

        reqFootwearType = Input.nextLine();
        inputFootwearName = Input.nextLine();

        int count = getCountByType(footwears, reqFootwearType);
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("Footwear not available");
        }

        Footwear secondHighest = getSecondHighestPriceByBrand(footwears, inputFootwearName);
        if (secondHighest != null) {
            System.out.println(secondHighest.getFootwearId());
            System.out.println(secondHighest.getFootwearName());
            System.out.println(secondHighest.getPrice());
        } else
            System.out.println("Brand not available");

//        Input input = new Input();
//        System.out.println(input.val);
    }
}

/*

https://github.com/Arijit-SE/Java-Solutions-TCS-IPA-Questions/blob/main/IPA2/Footwear.txt

create a class Footwear which consists of the below attributes.
  footwearId=int
  footwearName=String
  footwearType=String
  price =int

the above attributes should be private.
write getter and setter and parametrised constructor as required.

create the class footwearProgrammm with the main method.
implement the 2 static methods.getCountByType and
getSecondHighestPriceByBrand in the Solution class.


getCountByType method:
   this method will take two input parameters.
array of the Footwear objects and string parameter footwear type.
this method will return the count of the footwears from array of the
footwear objects for the given type of footwear.
if no footwear with the given footwear type is found in the
array of footwear abjects,then the method should return 0.



getSecondHighestPriceByBrand method:
  this method will take 2 input parameters-array of footwear objects and string parameter inputFootwearName.the method
will return the second highest footwear objects based on the price from the array of the Footwear objects


whose brand name matches with the input string parameter.


if no footwear with the given brand is present in the array of the footwear objects,the the method
should return null.

NOTE: no two footwear objects would have the same footwearId.All the searches should be case insensitive.
the above mentioned static methods should be called from the main method.

for getCountByType method- the main method should print the count of the footwears ,if the returned value
is greater than zero. or it should print "Footwear not available";

for getSecondHighestPriceByBrand method-The main method should print price from the returned footwear objects


if the returned footwear object is not null.else it should print "Brand not available".
for example.
112
ABC
25555
  where 112 is the footwear id,ABC is brand name,25555 is price.

consider the sample input and output.
100
Sketchers
sneakers
12345
103
Puma
running shoes
10099
102
reebok
Running shoes
5667
101
Reebok
running shoes
5656
99
reebok
floaters
5666
Running shoes
reebok

Sample output:
3
99
reebok
5666

Sample input2:

100
Puma
sneekers
12345
101
Puma
sneekers
10099
102
Puma
sneekers
5000
102
Reebok
sneekers
8000
104
Puma
floaters
2000
running shoes
bata

Sample output:
Footwear not available
Brand not available
 */