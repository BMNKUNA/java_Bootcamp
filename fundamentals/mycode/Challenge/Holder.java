    // 5. Date of Birth parsing using java package and split method 
    int BirthYear = Integer.parseInt(date_of_birth.split("/")[2]); 
    int age = 2024 - BirthYear; 
    System.out.println("You are " + age + " years old");

    // 6. Distance Conversion
    double Distance_from_store_in_miles = Integer.parseInt(distance_from_store)*0.62;
    int Distance_in_meters= Integer.parseInt(distance_from_store)*1000;
    System.out.println("The distance from the store is "+Distance_from_store_in_miles+" "+ "miles");

    System.out.println("The distance from the store in meters is "+ Distance_in_meters);

    // 7. Age Conversion 
    //In seconds
    int age_in_seconds = age*31536000;
    System.out.println("Your age in seconds is :" +age_in_seconds+"seconds");
    //In milliseconds
    int age_in_milliseconds = age_in_seconds*1000;
    System.out.println("Your age in milliseconds is :" +age_in_milliseconds+"milliseconds");
