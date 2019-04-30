package math.problems;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {
    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        /*
         * Find list of Prime numbers from number 2 to 1 million.
         * Try the best solution as possible.Which will take less CPU life cycle.
         * Out put number of Prime numbers on the given range.
         *
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         */
        int array[] = new int[] {2 - 1000000};

        System.out.println("Enter max number: ");

                String input = scanner.nextLine();
                int maxNumber = Integer.parseInt( input );

                System.out.println("List of the prime number between 2 - " + maxNumber);

                for (int num = 2; num <= maxNumber; num++)
                {
                    boolean isPrime = true;
                    for (int i=2; i <= num/2; i++)
                    {
                        if ( num % i == 0)
                        {
                            isPrime = false;
                            break;
                        }
                    }

                    if ( isPrime == true )
                        System.out.println(num);
                }

        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> PrimeNumber = new ArrayList<String>();
        try {
            connectToSqlDB.insertDataFromArrayToSqlTable( array,"tbl_PrimeNumber", "column_PrimeNumber");
            PrimeNumber = connectToSqlDB.readDataBase("tbl_PrimeNumber", "column_PrimeNumber");

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
        for (String st : PrimeNumber) {
            System.out.println(st);
        }

            }



        }







