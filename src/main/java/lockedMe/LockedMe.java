package lockedMe;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.*;
public class LockedMe {

    static final  String projectFilesPath ="C:\\Users\\Admin\\Desktop\\LockedMeProjewc\\LockedMeFile";
    static final String errorMessage="some error occured please contact admin:";
    public static void main(String[] args)throws IOException
    {
        displayWelcome();
        Scanner obj = new Scanner(System.in);
        try {
            int ch;
            do	{
                displayMenu();
                ch=Integer.parseInt(obj.nextLine());
                switch(ch)
                {
                    case 1: getAllFiles();
                        break;
                    case 2:creatFiles();
                        break;
                    case 3:deleteFiles();
                        break;
                    case 4:searchFiles();
                        break;
                    case 5:
                        System.out.println("\tThanks For Using LockedMe.com");
                        System.out.println("-----------------------------------------------");
                        System.exit(0);
                        break;
                    default: System.out.println("Invalid Option ");
                        break;
                }
            }
            while(ch>0);
        }
        catch(Exception ex)
        {
            System.out.println(errorMessage);
        }
        obj.close();
    }
    public static void displayWelcome()
    {
        System.out.println("====================================================");
        System.out.println("\t\tWelcome to Lockedme.com ");
        System.out.println("====================================================");
        System.out.println("\t\t Developed by Mr.Sagar Godambe ");
        System.out.println("----------------------------------------------------");
    }
    public static void displayMenu()
    {
        System.out.println("\t\t1:Display all the Files:");
        System.out.println("\t\t2:Add a New file:");
        System.out.println("\t\t3:Delete a File:");
        System.out.println("\t\t4:Search a File:");
        System.out.println("\t\t5:Exit");
        System.out.println("Enter Your Choice: ");

    }
    /**-----------------------------------------------------------------
     * this function will return  all the file from project directory.
     */
    public static void getAllFiles()throws IOException
    {
        try {
            File folder = new File(projectFilesPath);
            File[] listofFiles = folder.listFiles();

            if(listofFiles.length==0)
                System.out.println("No Files Exist in the directory");
            else	{
                for (var l:listofFiles)
                {
                    System.out.println(l.getName());
                }
            }
        }
        catch(Exception ex) {
            System.out.println(errorMessage);
        }
    }
    /**-------------------------------------------------------------------
     *  * this function will create the file in project directory

     */
    public static void creatFiles()throws IOException
    {
        try {
            Scanner obj = new Scanner(System.in);
            String filename;
            System.out.println("Enter file name:  ");
            filename = obj.nextLine();
            File folder = new File(projectFilesPath);
            File[] listofFiles = folder.listFiles();

            LinkedList<String> filenames = new LinkedList<String>();

            for (var l : listofFiles)
                filenames.add(l.getName());

            if (filenames.contains(filename))
                System.out.println(filename + " " + "File is already Available!");
            else {
                int linesCount;
                System.out.println("Enter how many lines in the Files: ");
                linesCount = Integer.parseInt(obj.nextLine());

                FileWriter myWriter = new FileWriter(projectFilesPath + "\\" + filename);
                for (int i = 1; i <= linesCount; i++) {
                    System.out.println("Enter the File Line: ");
                    myWriter.write(obj.nextLine() + "\n");
                }
                System.out.println(filename + " " + "File Created Successfully !");
            }
        }
        catch(Exception Ex)
        {System.out.println(errorMessage);
        }
    }
    /**--------------------------------------------------------------------------------
     *  * this function will delete  the file from project directory

     */
    public static void deleteFiles()throws IOException
    {
        Scanner obj= new Scanner(System.in);
        try
        {
            String fileName;
            System.out.println("Enter the File Name to be deleted:");
            fileName =obj.nextLine();
            File file=new File(projectFilesPath+"\\"+fileName);
            if  (file.exists())
            {
                file.delete();
                System.out.println(fileName+" "+"File Deleted Successfully! ");
            }
            else
                System.out.println(fileName+" "+"File Do not exist!");
        }
        catch (Exception Ex)
        {
            System.out.println(errorMessage);
        }
    }
    /**------------------------------------------------------------------------------------
     *  * this function will search   the file from project directory

     */
    public static void searchFiles()throws IOException
    {
        Scanner obj=new Scanner(System.in);
        try	{
            System.out.println("Enter the FileName tobe  Searched :");
            String	fileName =obj.nextLine();

            File folder =new File(projectFilesPath);
            File[] listofFiles=folder.listFiles();

            LinkedList<String> filenames=new LinkedList<String>();

            for (var l:listofFiles)
                filenames.add(l.getName());

            if (filenames.contains(fileName))
                System.out.println(fileName+" "+"File is Available!");
            else
                System.out.println(fileName+" "+"File is not Available!");
        }
        catch (Exception Ex)
        {
            System.out.println(errorMessage);
        }
    }
}