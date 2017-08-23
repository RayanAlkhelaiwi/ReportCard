package com.ReanAlklwiy;

public class ReportCard {

    /**
     * Declaration for the needed variables
     */
    private final String mSchoolName = "Udacity University";
    private String mStudentName = "";
    private long mStudentID = 0;
    private double mCurrentGPA = 0.0d;
    private double mComputerScienceIntroGrade = 0.0d;
    private double mChemistryGrade = 0.0d;
    private double mPhysicsGrade = 0.0d;
    private double mAndroidBasicsGrade = 0.0d;


    /**
     * Constructor for the custom class
     *
     * @param studentName
     * @param studentID
     * @param currentGPA
     * @param computerScienceIntroGrade
     * @param chemistryGrade
     * @param physicsGrade
     * @param androidBasicsGrade
     */
    public ReportCard(String studentName, int studentID, double currentGPA,
                      double computerScienceIntroGrade, double chemistryGrade, double physicsGrade, double androidBasicsGrade) {

        mStudentName = studentName;
        mStudentID = studentID;
        mCurrentGPA = currentGPA;
        mComputerScienceIntroGrade = computerScienceIntroGrade;
        mChemistryGrade = chemistryGrade;
        mPhysicsGrade = physicsGrade;
        mAndroidBasicsGrade = androidBasicsGrade;
    }

    /**
     * setter method for the student name
     *
     * @param studentName
     */
    public void setStudentName(String studentName) {

        this.mStudentName = studentName;
    }

    /**
     * setter method for the student ID
     *
     * @param studentID
     */
    public void setStudentID(int studentID) {
        this.mStudentID = studentID;
    }

    /**
     * setter method for the current GPA
     *
     * @param currentGPA
     */
    public void setCurrentGPA(double currentGPA) {
        this.mCurrentGPA = currentGPA;
    }

    /**
     * setter method for the Computer Science grade
     *
     * @param mComputerScienceIntroGrade
     */
    public void setComputerScienceIntroGrade(double mComputerScienceIntroGrade) {
        this.mComputerScienceIntroGrade = mComputerScienceIntroGrade;
    }

    /**
     * setter method for the Chemistry grade
     *
     * @param mChemistryGrade
     */
    public void setChemistryGrade(double mChemistryGrade) {
        this.mChemistryGrade = mChemistryGrade;
    }

    /**
     * setter method for the Physics grade
     *
     * @param mPhysicsGrade
     */
    public void setPhysicsGrade(double mPhysicsGrade) {
        this.mPhysicsGrade = mPhysicsGrade;
    }

    /**
     * setter method for the Android Basics grade
     *
     * @param mAndroidBasicsGrade
     */
    public void setAndroidBasicsGrade(double mAndroidBasicsGrade) {
        this.mAndroidBasicsGrade = mAndroidBasicsGrade;
    }

    /**
     * getter method for the constant school name
     *
     * @return
     */
    public String getSchoolName() {
        return mSchoolName;
    }

    /**
     * getter method for the student name
     *
     * @return
     */
    public String getStudentName() {
        return mStudentName;
    }

    /**
     * getter method for the student ID
     *
     * @return
     */
    public long getStudentID() {
        return mStudentID;
    }

    /**
     * getter method for current GPA
     *
     * @return
     */
    public double getCurrentGPA() {

        double maxGPA = 4.00;

        if (mCurrentGPA > maxGPA) {

            mCurrentGPA = maxGPA;
        }
        return mCurrentGPA;
    }

    /**
     * getter method for Computer Science grade
     *
     * @return
     */
    public String getComputerScienceIntroGrade() {
        return toLetterGrade(mComputerScienceIntroGrade);
    }

    /**
     * getter method for Chemistry grade
     *
     * @return
     */
    public String getChemistryGrade() {
        return toLetterGrade(mChemistryGrade);
    }

    /**
     * getter method for Physics grade
     *
     * @return
     */
    public String getPhysicsGrade() {
        return toLetterGrade(mPhysicsGrade);
    }

    /**
     * getter method for Android Basics grade
     *
     * @return
     */
    public String getAndroidBasicsGrade() {
        return toLetterGrade(mAndroidBasicsGrade);
    }

    /**
     * A method to convert the given double grades to their respected letter grades.
     *
     * @param grade
     * @return
     */
    private String toLetterGrade (double grade) {

        //For D grades' variances
        if (grade > 59 && grade <= 63) {
            return "D-";
        } else if (grade > 63 && grade <= 66) {
            return "D";
        } else if (grade > 66 && grade <= 69) {
            return "D+";
        }

        //For C grades' variances
        else if (grade > 69 && grade <= 73) {
            return "C-";
        } else if (grade > 73 && grade <= 76) {
            return "C";
        } else if (grade > 76 && grade <= 79) {
            return "C+";
        }

        //For B grades' variances
        else if (grade > 79 && grade <= 83) {
            return "B-";
        } else if (grade > 83 && grade <= 86) {
            return "B";
        } else if (grade > 86 && grade <= 89) {
            return "B+";
        }

        //For A grades' variances
        else if (grade > 89 && grade <= 93) {
            return "A-";
        } else if (grade > 93 && grade <= 96) {
            return "A";
        } else if (grade > 96 && grade <= 99) {
            return "A+";
        }

        //For F grade
        else {
            return "F";
        }
    }

    /**
     * toString() method to return a readable content of the custom class.
     *
     * @return
     */
    @Override
    public String toString() {
        return "School Name: " + getSchoolName() + ',' +
                "\n Name: " + getStudentName() + ',' +
                '\n' + getStudentName() + "\'s ID: " + getStudentID() +
                "\n GPA: " + getCurrentGPA() + " out of 4.0" +
                "\n Introduction to CS Grade is: " + getComputerScienceIntroGrade() + ',' +
                "\n Chemistry Grade is: " + getChemistryGrade() + ',' +
                "\n Physics Grade is: " + getPhysicsGrade() + ',' +
                "\n Android Basics Grade is: " + getAndroidBasicsGrade();
    }
}