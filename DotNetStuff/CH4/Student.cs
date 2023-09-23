using System;

namespace Student
{
    class Student
    {
        private string studentNumber;
        private string lastName;
        private string firstName;
        private int score1;
        private int score2;
        private int score3;
        private string major;
        private DateTime dob;

        //Constructors
        //Constructor with no body

        public Student()
        {
        }

        public Student(string sID)
        {
            this.studentNumber = sID;
        }

        public Student(string sID, string lastName, string firstName)
        {
            studentNumber = sID;
            this.lastName = lastName;
            this.firstName = firstName;
        }

        public Student(string sID, string lastName, string firstName,
        int score1, int score2, int score3, string major){
            studentNumber = sID;
            this.lastName = lastName;
            this.firstName = firstName;
            this.score1 = score1;
            this.score2 = score2;
            this.score3 = score3;
            this.major = major;
        }


        public override string ToString()
        {
            return "ID: " + studentNumber + " Last Name: " + lastName + " First Name: " + firstName + " "
             + score1 + " " + score2 + " " + score3 + " " + major;
        }

        

        public double GetAverage()
        {
            return (score1 + score2 + score3) / 3;
        }

        public DateTime Dob { get => dob; set => dob = value; }

        public int Age
        {
            get {  return (int)((DateTime.Now - Dob).TotalDays / 365); }
        }

        public string studentLastName { get => lastName; set => lastName = value; }
        public string studentFirstName { get => firstName; set => firstName = value; }
        public string Major {get => major; set => major = value; }

        public string ProperName
        {
            get { return studentFirstName + " " + studentLastName; }
        }
    }
}