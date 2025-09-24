package com.example.helloworld.controller;

import com.example.helloworld.model.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:5173"})
public class HelloController {

    private static final List<User> MOCK_DATAS = List.of( // get more from https://www.mock-data.com/
            new User(5238061199120036L, "Cory Spinka", "Vella_Lemke@yahoo.com", "289.735.9784 x3355", "Cape Verde", "2025-04-25T01:18:08.401Z", "https://avatars.githubusercontent.com/u/42974100"),
            new User(7481266765557739L, "Oliver Champlin", "Shea_Bartoletti@yahoo.com", "(827) 247-7883 x59990", "Greenland", "2025-05-11T23:57:42.439Z", "https://avatars.githubusercontent.com/u/27183025"),
            new User(7168021774471615L, "Lee Langosh", "Shannon.Sauer@yahoo.com", "1-441-368-8777 x1794", "Kiribati", "2025-08-01T10:50:44.113Z", "https://avatars.githubusercontent.com/u/89841526"),
            new User(6737017112101209L, "Lewis Heller", "Malachi55@hotmail.com", "(537) 633-9112", "Hungary", "2025-06-28T01:21:44.493Z", "https://avatars.githubusercontent.com/u/98837744"),
            new User(8642626049835263L, "Jeanette Schumm", "Jaylen.Corwin@hotmail.com", "(866) 430-6589 x6225", "Saint Martin", "2025-08-05T09:53:04.767Z", "https://avatars.githubusercontent.com/u/990837"),
            new User(8983169226059581L, "Darrin Runte I", "Yasmeen_Lueilwitz58@yahoo.com", "(834) 887-1422", "Jersey", "2025-04-04T16:27:29.510Z", "https://avatars.githubusercontent.com/u/86011473"),
            new User(4205715036073991L, "Joann Prohaska", "Verlie.Cartwright25@gmail.com", "354.572.3767 x6012", "Costa Rica", "2024-12-23T01:03:21.484Z", "https://avatars.githubusercontent.com/u/1671757"),
            new User(6796776569626672L, "Dr. Joseph Wilkinson", "Peggie76@hotmail.com", "588.627.0084 x5775", "Brunei Darussalam", "2025-05-26T20:14:23.046Z", "https://avatars.githubusercontent.com/u/59325056"),
            new User(5795341845659364L, "Irvin Beatty", "Roger_Windler@hotmail.com", "1-215-839-0651 x30723", "Grenada", "2025-08-18T01:33:30.809Z", "https://avatars.githubusercontent.com/u/3350470"),
            new User(1841446313217341L, "Kelley Mante", "Hudson95@hotmail.com", "205.519.3983 x4095", "Central African Republic", "2025-02-10T05:26:23.711Z", "https://avatars.githubusercontent.com/u/41719277"),
            new User(3573088725968457L, "Chester Hudson", "Jaeden67@yahoo.com", "762-993-1304 x0174", "Burkina Faso", "2025-03-06T23:11:50.092Z", "https://avatars.githubusercontent.com/u/70869165"),
            new User(3062789559382712L, "Dr. Raul Kutch", "Vance_Wiza@yahoo.com", "1-426-556-4326 x8577", "Israel", "2024-10-24T11:29:57.844Z", "https://avatars.githubusercontent.com/u/12511477"),
            new User(7993309969091805L, "Jackie Dach-Morar", "Jasen.Lemke69@yahoo.com", "336-638-2820 x38335", "Malawi", "2024-09-27T19:36:23.799Z", "https://avatars.githubusercontent.com/u/1174296"),
            new User(2698060183641270L, "Henrietta Murray Jr.", "Kirk.Schmeler@hotmail.com", "529.668.9826 x841", "Martinique", "2025-02-16T15:21:13.284Z", "https://avatars.githubusercontent.com/u/48083397"),
            new User(3794043149327472L, "Annie Bogan-Cronin Sr.", "Abbigail34@gmail.com", "1-930-993-9568", "Peru", "2024-10-11T21:45:11.689Z", "https://avatars.githubusercontent.com/u/27280888"),
            new User(5273134007404779L, "Caleb Turner", "Clark_Mann-Nicolas64@hotmail.com", "217-617-6389 x2940", "French Southern Territories", "2025-06-05T11:56:02.963Z", "https://avatars.githubusercontent.com/u/7479941"),
            new User(5721995432219875L, "Clayton Quigley", "Thurman_Mohr@gmail.com", "1-691-925-2093", "Niue", "2025-09-22T21:54:55.486Z", "https://avatars.githubusercontent.com/u/2389250"),
            new User(2717672246053684L, "Orlando Yost", "Margarete_Senger@hotmail.com", "224-681-0833 x81025", "Sint Maarten", "2025-02-15T20:26:46.277Z", "https://avatars.githubusercontent.com/u/81350199"),
            new User(7952034305708535L, "Ella Gleichner", "Kiera.Kulas10@yahoo.com", "549.531.3884", "Central African Republic", "2025-03-02T09:48:35.603Z", "https://avatars.githubusercontent.com/u/93944587"),
            new User(916428193388957L, "Gladys Pollich I", "Junior_Jakubowski65@yahoo.com", "(305) 754-2789", "Eritrea", "2025-02-15T02:12:14.822Z", "https://avatars.githubusercontent.com/u/49150206"),
            new User(4434347244468760L, "Amanda Marvin", "Jamie60@hotmail.com", "1-634-689-0728", "Malawi", "2024-11-30T15:31:21.193Z", "https://avatars.githubusercontent.com/u/8965455"),
            new User(7996176375711576L, "Derek Murray", "Michelle_Legros@hotmail.com", "823-263-7192 x604", "Belgium", "2025-02-13T17:53:43.729Z", "https://avatars.githubusercontent.com/u/60067988"),
            new User(1030323696966095L, "Franklin Kiehn", "Lawson43@gmail.com", "1-669-348-3886", "Jersey", "2025-06-01T00:23:06.731Z", "https://avatars.githubusercontent.com/u/59321274"),
            new User(3342035671148098L, "Stacey Ernser", "Ellen_Okuneva@yahoo.com", "1-836-520-4042", "Serbia", "2025-06-15T16:05:14.427Z", "https://avatars.githubusercontent.com/u/61816124"),
            new User(8030812578961804L, "Kelvin Konopelski", "Eloy.Christiansen@hotmail.com", "386-372-3039 x053", "San Marino", "2025-05-04T19:05:26.180Z", "https://avatars.githubusercontent.com/u/98880216"),
            new User(7872590867205115L, "Johnathan Muller", "Brown.Wilkinson49@yahoo.com", "382.932.3283 x698", "Tuvalu", "2025-02-17T21:55:10.970Z", "https://avatars.githubusercontent.com/u/1770037"),
            new User(2387922727897822L, "Mildred Dare-Glover", "Brook.Stracke93@yahoo.com", "1-482-593-2532", "Saint Kitts and Nevis", "2024-12-27T21:08:19.398Z", "https://avatars.githubusercontent.com/u/34660897"),
            new User(5348098958404534L, "Owen Schmeler", "Alexzander.Wisozk@gmail.com", "430-499-3360 x65195", "Democratic People's Republic of Korea", "2025-03-06T02:58:31.036Z", "https://avatars.githubusercontent.com/u/57228093"),
            new User(7117026451630480L, "Chad Herman", "Isabelle.Gerhold5@hotmail.com", "316-337-3402 x25585", "Greenland", "2025-02-07T13:22:29.019Z", "https://avatars.githubusercontent.com/u/86151452"),
            new User(4239948086394938L, "Alyssa Schulist", "Domenic.Mills-Hane@hotmail.com", "390-710-3293", "Nigeria", "2024-11-05T10:29:16.941Z", "https://avatars.githubusercontent.com/u/62685349")
    );

    @GetMapping("/hello")
    public String getHello() {
        return "Hello, World!";
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return MOCK_DATAS;
    }
}