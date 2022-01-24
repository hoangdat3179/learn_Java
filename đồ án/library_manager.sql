-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: db
-- Thời gian đã tạo: Th1 24, 2022 lúc 04:19 AM
-- Phiên bản máy phục vụ: 8.0.27
-- Phiên bản PHP: 7.4.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `library_manager`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `authors`
--

CREATE TABLE `authors` (
  `id_authors` varchar(11) NOT NULL,
  `name` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `address` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Đang đổ dữ liệu cho bảng `authors`
--

INSERT INTO `authors` (`id_authors`, `name`, `address`) VALUES
('0372852262', 'Drusie Skill', '17667 Sutherland Alley'),
('0493189068', 'Grier Larter', '47079 Atwood Road'),
('0533065879', 'Rosalind Culross', '2183 Redwing Plaza'),
('0663166101', 'Geoffry Briiginshaw', '309 Northwestern Park'),
('0684185482', 'Stacy Hyett', '4192 Reindahl Crossing'),
('0927839024', 'Matt Porter', '5 Melody Drive'),
('1077014899', 'Myrta Iacabucci', '2679 Meadow Ridge Point'),
('1390078000', 'Dick Ennew', '14255 Glacier Hill Crossing'),
('1988848148', 'Yves McLinden', '7089 Spaight Point'),
('2956602683', 'Darda Lydster', '736 Susan Drive'),
('3557297934', 'Casper Rosenbloom', '609 Mendota Road'),
('3788334746', 'Estella Claxson', '24 Norway Maple Park'),
('3835701916', 'Peyton Rigts', '1 Barby Parkway'),
('4265615597', 'Norma Ashbee', '2 American Trail'),
('5371752072', 'Candice Vigar', '308 Forest Run Center'),
('7043493803', 'Gary Cicchetto', '2 Mayfield Road'),
('8894580342', 'Letty Corbett', '79306 Artisan Pass'),
('9161949396', 'Tootsie Mancktelow', '5904 Heath Circle'),
('9425111995', 'Benn Pfiffer', '3 Mendota Park'),
('9947132420', 'Matt Jupp', '8482 Reindahl Park');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `book`
--

CREATE TABLE `book` (
  `id_book` varchar(10) NOT NULL,
  `title` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci,
  `page_number` int DEFAULT NULL,
  `amount` int DEFAULT NULL,
  `publish_year` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Đang đổ dữ liệu cho bảng `book`
--

INSERT INTO `book` (`id_book`, `title`, `page_number`, `amount`, `publish_year`) VALUES
('0015372251', 'Symphonie pastorale, La', 3, 48, 2020),
('0043174140', 'Angels Crest', 78, 82, 2013),
('0145445666', 'Andrei Rublev (Andrey Rublyov)', 44, 37, 2011),
('0207033420', 'Bride Wore Black, The (La mariée était en noir)', 85, 74, 2001),
('0230401481', 'Underworld: Evolution', 54, 64, 2001),
('0232881677', 'Assassination', 2, 22, 2013),
('0238532747', 'Rhinoceros', 97, 26, 2012),
('0395350077', 'Nurse Betty', 66, 73, 2017),
('0521818206', 'True Crime', 53, 93, 2018),
('0612995259', 'You and Me (Ty i ya)', 47, 75, 2021),
('0636917991', 'Odd Life of Timothy Green, The', 42, 25, 2022),
('0678988382', 'Five Wives, Three Secretaries and Me', 94, 45, 2017),
('0723341583', 'Sleep Furiously', 77, 35, 2020),
('0790852004', 'Bellboy, The', 72, 28, 2002),
('0890721319', 'Boys, Les', 52, 17, 2008),
('0957596839', 'Day Night Day Night', 59, 57, 2000),
('0971968500', '27 Dresses', 52, 98, 2018),
('1051841011', 'Sitter, The', 75, 31, 2010),
('1194438571', 'Viking, The', 43, 75, 2005),
('1347823166', 'Night at the Opera, A', 82, 62, 2009),
('1355059038', 'Cult of the Cobra', 59, 23, 2011),
('1514410141', 'Zona Zamfirova', 39, 25, 2000),
('1597194239', 'Cargo', 42, 91, 2005),
('1979125910', 'Fragile', 2, 17, 2009),
('1983371777', 'Je m\'appelle Elisabeth', 29, 96, 2008),
('2229035665', 'Sweet Sixteen', 63, 97, 2016),
('2294555449', 'Something Like Happiness (Stestí)', 79, 29, 2020),
('2371970093', 'Live Nude Girls', 84, 5, 2016),
('2670667899', 'Man Who Left His Will on Film, The (Tôkyô sensô sengo hiwa)', 29, 20, 2007),
('2782750410', 'Revenge of the Zombies', 43, 39, 2013),
('2828853810', 'Perfect Sisters', 48, 44, 2000),
('2883226199', 'Two-Minute Warning', 33, 47, 2004),
('2902375549', 'March or Die', 49, 62, 2020),
('2947403746', 'Nick Fury: Agent of S.H.I.E.L.D.', 35, 74, 2008),
('2949532365', 'Calvary', 9, 54, 2014),
('3007389674', 'Little Fridolf Becomes a Grandfather', 28, 54, 2000),
('3030839141', 'Eyes Wide Shut', 28, 96, 2019),
('3309483460', 'Paid', 59, 71, 2015),
('3379064394', 'High School Hellcats', 45, 73, 2012),
('3450558374', 'Last Exit', 89, 34, 2007),
('3506364138', 'For Pete\'s Sake', 8, 40, 2001),
('3639195531', 'Goodbye Lover', 95, 97, 2008),
('3782481380', 'Outlaw, The', 24, 20, 2015),
('3793892840', 'Easy Rider', 47, 100, 2000),
('3938223367', 'Starfighters, The', 49, 10, 2012),
('4029520464', 'Comedy of Terrors, The', 33, 40, 2022),
('4075517853', 'Querelle', 16, 44, 2013),
('4182433157', 'What Price Glory', 44, 3, 2021),
('4201581780', 'Early Summer (Bakushû)', 81, 59, 2001),
('4251827759', 'Prime Suspect', 46, 71, 2011),
('4583772319', 'Turning, The', 28, 46, 2011),
('4750543578', 'Mummies: Secrets of the Pharaohs (a.k.a. Mummies 3D)', 59, 40, 2005),
('4769516010', 'High Anxiety', 98, 75, 2000),
('5239492131', 'Big Stan', 97, 74, 2002),
('5249928307', 'Little Darlings', 27, 70, 2006),
('5276577595', 'Blood on the Moon', 27, 99, 2007),
('5791319924', 'You Again', 55, 76, 2009),
('6073821867', 'Paradox', 97, 86, 2000),
('6109122270', 'Beautiful Mind, A', 43, 39, 2016),
('6254294826', 'Anatomy of Hell (Anatomie de l\'enfer)', 56, 61, 2002),
('6355843345', 'Merry Madagascar', 80, 66, 2005),
('6460161003', 'Black Sleep, The', 16, 84, 2000),
('6531282762', 'Supercop 2 (Project S) (Chao ji ji hua)', 77, 39, 2001),
('6555875208', 'Father and Guns (De père en flic)', 35, 49, 2009),
('6611724621', 'Love Serenade', 3, 47, 2008),
('6716462570', 'Ce que mes yeux ont vu', 97, 89, 2008),
('6849662147', 'Salvation, The', 54, 71, 2010),
('6853656482', 'Sleepers', 97, 93, 2001),
('7208866058', 'Beneath the Rooftops of Paris (Sous les toits de Paris)', 53, 86, 2022),
('7310026322', 'Nicholas on Holiday', 94, 69, 2006),
('7364315721', 'Barfi!', 27, 74, 2006),
('7504626953', 'Léon Morin, Priest (Léon Morin, prêtre)', 70, 4, 2004),
('7587699503', 'Bishop Murder Case, The', 25, 90, 2019),
('7707048164', 'The Snow White Murder Case', 24, 58, 2014),
('7833287415', 'Intruder, The', 17, 55, 2008),
('7943704738', 'Goodfellas', 27, 3, 2004),
('7967393902', 'For Sale (À Vendre)', 80, 40, 2015),
('8062865770', 'No Blade of Grass', 41, 23, 2007),
('8097015153', 'The Scapegoat', 76, 72, 2018),
('8215697100', 'Human Nature', 65, 32, 2000),
('8292638210', 'Atomic Twister', 45, 36, 2010),
('8377468433', 'Bionicle 3: Web of Shadows', 80, 53, 2002),
('8443252553', 'White Chicks', 95, 60, 2004),
('8672916883', 'Funny About Love', 81, 6, 2011),
('8695600955', 'Allan Quatermain and the Lost City of Gold', 87, 37, 2021),
('8791034353', 'District 13: Ultimatum (Banlieue 13 - Ultimatum)', 96, 43, 2015),
('8820301261', 'Battlestar Galactica', 11, 43, 2002),
('8878679992', 'Dr. Otto and the Riddle of the Gloom Beam', 27, 5, 2020),
('8922677910', 'HellBent', 44, 9, 2020),
('9163605406', 'Angriest Man in Brooklyn, The', 47, 52, 2019),
('9245196453', 'Jackie Brown', 72, 36, 2007),
('9296334993', 'Marine, The', 82, 28, 2022),
('9354357202', 'Tales from the Script', 58, 24, 2012),
('9621047692', 'Midnight Chronicles', 56, 30, 2005),
('9694876982', 'Holiday Inn', 100, 5, 2001),
('9707912073', 'Wives and Lovers', 53, 31, 2018),
('9736371433', 'Girlhood', 5, 58, 2021),
('9796823535', 'Dingo', 21, 30, 2012),
('9809712480', 'Fearful Symmetry: The Making of \'To Kill a Mockingbird\'', 12, 9, 2021),
('9937105005', 'Fever in the Blood, A', 39, 28, 2007);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `book_authors`
--

CREATE TABLE `book_authors` (
  `id_book` varchar(10) NOT NULL,
  `id_authors` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `book_category`
--

CREATE TABLE `book_category` (
  `id_book` varchar(10) NOT NULL,
  `id_category` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `book_liquidation`
--

CREATE TABLE `book_liquidation` (
  `id_book` varchar(10) NOT NULL,
  `id_book_liquidation` varchar(10) NOT NULL,
  `name_book` text NOT NULL,
  `liquidation_date` datetime NOT NULL,
  `reason` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `book_positions`
--

CREATE TABLE `book_positions` (
  `id_book` varchar(10) NOT NULL,
  `id_position` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `book_publish_company`
--

CREATE TABLE `book_publish_company` (
  `id_book` varchar(10) NOT NULL,
  `id_publisher` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `category`
--

CREATE TABLE `category` (
  `id_category` varchar(10) NOT NULL,
  `name` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Đang đổ dữ liệu cho bảng `category`
--

INSERT INTO `category` (`id_category`, `name`) VALUES
('0738546496', 'Detective story'),
('1842736876', 'Fable'),
('3125243467', 'Funny story'),
('3905784203', 'Folk Tale'),
('5181437257', 'Short story'),
('5241049231', 'Fairy Tale'),
('6127351847', 'Autobiography'),
('6699637940', 'Graphic novel'),
('7001336785', 'Anecdote'),
('7348582656', 'Myth'),
('8805683957', 'Ghost story'),
('8918531648', 'Legend'),
('9154547725', 'Comic');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `employee`
--

CREATE TABLE `employee` (
  `id_employee` varchar(10) NOT NULL,
  `name` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci,
  `birthday` datetime DEFAULT NULL,
  `gender` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci,
  `number` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci,
  `address` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci,
  `ID_CARD` varchar(12) DEFAULT NULL,
  `position` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Đang đổ dữ liệu cho bảng `employee`
--

INSERT INTO `employee` (`id_employee`, `name`, `birthday`, `gender`, `number`, `address`, `ID_CARD`, `position`) VALUES
('0514923768', 'Orelia Corbally', '2014-09-19 00:00:00', 'Female', '(192) 6814567', '2187 Grim Junction', '612060209718', 'Environmental Tech'),
('1284124436', 'Sukey Notley', '2008-05-04 00:00:00', 'Male', '(997) 5116377', '95160 Glacier Hill Way', '881791270127', 'Legal Assistant'),
('1824646240', 'Hugues Antonucci', '2000-02-23 00:00:00', 'Male', '(842) 6569229', '876 Pepper Wood Court', '167068070900', 'Nurse Practicioner'),
('1902348907', 'Lauri Ganforthe', '2009-12-29 00:00:00', 'Male', '(193) 6379570', '420 Algoma Point', '434730548449', 'Help Desk Operator'),
('2400421900', 'Kurtis Peetermann', '1998-05-04 00:00:00', 'Non-binary', '(580) 8996413', '5892 Laurel Plaza', '576296703942', 'Programmer IV'),
('2402347589', 'Kendricks Atthow', '1996-01-26 00:00:00', 'Male', '(721) 9150810', '95 David Court', '927058117860', 'Speech Pathologist'),
('3120663069', 'Orel Muzzini', '2012-12-04 00:00:00', 'Female', '(132) 2285340', '6 Tony Alley', '504529344066', 'Assistant Media Planner'),
('3849139565', 'Glenda Pammenter', '2009-09-13 00:00:00', 'Male', '(511) 4298123', '0 Stuart Center', '397951167782', 'Financial Advisor'),
('4156217183', 'Demott Farbrace', '2005-05-19 00:00:00', 'Male', '(581) 4237988', '3 Sullivan Court', '675335287854', 'Systems Administrator II'),
('4565814307', 'Christyna Nother', '2001-07-14 00:00:00', 'Male', '(238) 5747312', '60 Melody Street', '704568706525', 'Clinical Specialist'),
('4828580654', 'Keriann Kirk', '1998-07-11 00:00:00', 'Female', '(808) 4542905', '0 Grover Avenue', '904619234444', 'Librarian'),
('5245868083', 'Gerti MacIlriach', '2011-10-23 00:00:00', 'Male', '(610) 5366798', '06660 Sutherland Junction', '486516128199', 'Compensation Analyst'),
('5446263022', 'Erwin Mazzeo', '2012-11-30 00:00:00', 'Male', '(694) 9484135', '35 1st Terrace', '260377490664', 'Chemical Engineer'),
('5574891948', 'Ely Birley', '2013-02-13 00:00:00', 'Male', '(585) 7707638', '0 Mifflin Center', '221644512813', 'Statistician I'),
('6632742777', 'Jade Ledeker', '1993-08-04 00:00:00', 'Male', '(750) 9238470', '4 Melvin Junction', '842540312355', 'Recruiter'),
('6718477923', 'Carmencita Marnane', '1994-09-07 00:00:00', 'Male', '(587) 5569581', '313 Bluejay Road', '101420801365', 'Quality Engineer'),
('8294266051', 'Marnie Borland', '1996-12-19 00:00:00', 'Male', '(421) 1572490', '0 Homewood Terrace', '281548206362', 'Programmer Analyst IV'),
('9136296716', 'Vlad Torrie', '2004-05-09 00:00:00', 'Female', '(551) 1298627', '0 Cascade Plaza', '772252042207', 'Administrative Officer'),
('9139948285', 'Kelsey Caffin', '1994-04-17 00:00:00', 'Female', '(862) 6499797', '2 Brown Alley', '647115517140', 'Geological Engineer'),
('9404740667', 'Veradis Edwin', '1991-01-04 00:00:00', 'Female', '(796) 8915312', '847 Tennessee Plaza', '429848435319', 'Graphic Designer');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `loan_slip`
--

CREATE TABLE `loan_slip` (
  `id_card` varchar(10) NOT NULL,
  `id_book` varchar(10) NOT NULL,
  `id_employee` varchar(10) NOT NULL,
  `name_book` text NOT NULL,
  `name_reader` text NOT NULL,
  `borrowed_date` datetime NOT NULL,
  `book_return_date` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `positions`
--

CREATE TABLE `positions` (
  `id_position` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `name_position` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Đang đổ dữ liệu cho bảng `positions`
--

INSERT INTO `positions` (`id_position`, `name_position`) VALUES
('0900126361', 'Novel'),
('2194491791', 'Exercise book'),
('2218773759', 'Science fiction book'),
('2267191865', 'Cookery book'),
('3837638634', 'Booklet'),
('3928292323', 'Autobiography'),
('4427401791', 'Textbook'),
('4694256580', 'Paperback'),
('5320186533', 'Magazine'),
('5608888626', 'Comic'),
('5741554008', 'Poem'),
('6163326849', 'Hardcover'),
('6563251013', 'Picture book'),
('7034157650', 'Short story'),
('7159709667', 'Nonfiction'),
('7235237260', 'Dictionary'),
('8134449050', 'Encyclopedia'),
('8363798916', 'Reference book'),
('8624852706', 'Bestseller'),
('9495929032', 'Thriller book');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `publish_company`
--

CREATE TABLE `publish_company` (
  `id_publisher` varchar(10) NOT NULL,
  `name` varchar(50) NOT NULL,
  `address` varchar(100) DEFAULT NULL,
  `found_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Đang đổ dữ liệu cho bảng `publish_company`
--

INSERT INTO `publish_company` (`id_publisher`, `name`, `address`, `found_date`) VALUES
('0816029903', 'Hills, Kris and Grimes', '76286 Fair Oaks Circle', '2013-10-20'),
('1281788864', 'Bosco LLC', '61266 Waubesa Alley', '2018-06-21'),
('1493278703', 'O\'Hara-Harris', '9386 Fieldstone Avenue', '2019-10-31'),
('1635339073', 'Mraz-West', '5593 Coleman Point', '2016-04-02'),
('2310254304', 'Mann-Orn', '06985 New Castle Avenue', '2013-08-27'),
('2416645889', 'Schumm-Doyle', '2 American Circle', '2015-04-29'),
('2655881443', 'Corwin Inc', '47 Sage Lane', '2017-04-10'),
('3603805127', 'Hamill and Sons', '1261 Erie Point', '2016-10-02'),
('5174331902', 'Batz and Sons', '7789 Commercial Trail', '2021-05-27'),
('5708500654', 'Carter-Mayer', '107 Blaine Trail', '2012-07-26'),
('6011403573', 'Aufderhar LLC', '46599 Village Pass', '2016-03-04'),
('6131812586', 'Rowe, Crona and Rosenbaum', '309 Sycamore Drive', '2014-03-29'),
('6293282809', 'Gerlach, Ritchie and Schmitt', '1661 Division Circle', '2014-09-30'),
('6615655403', 'Stracke, Franecki and Hickle', '7 Bartillon Drive', '2015-12-22'),
('6691967003', 'Gislason-Bogan', '4 Iowa Lane', '2016-05-23'),
('7077308405', 'Bartell LLC', '9227 Lighthouse Bay Center', '2020-06-22'),
('7270839743', 'Mayer-Grady', '9151 Toban Way', '2019-04-03'),
('7651719425', 'Boehm, Botsford and Schmidt', '54 Towne Place', '2016-12-21'),
('7854413053', 'Murazik-Kuvalis', '251 Bonner Park', '2017-01-21'),
('9237059353', 'Lang, Dickens and Gleichner', '47 Ronald Regan Hill', '2016-10-25');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `student`
--

CREATE TABLE `student` (
  `id_card` varchar(10) NOT NULL,
  `name` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci,
  `birthday` datetime DEFAULT NULL,
  `gender` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci,
  `class` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci,
  `address` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci,
  `number` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci,
  `date_of_issue` date DEFAULT NULL,
  `expiry_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Đang đổ dữ liệu cho bảng `student`
--

INSERT INTO `student` (`id_card`, `name`, `birthday`, `gender`, `class`, `address`, `number`, `date_of_issue`, `expiry_date`) VALUES
('0449697630', 'Lorettalorna Aubin', '1991-02-27 00:00:00', 'Male', '4', '80 Hollow Ridge Place', '(404) 2804815', '2021-10-06', '2027-07-19'),
('0653659598', 'Janey Mackison', '1992-11-24 00:00:00', 'Female', '8', '8 Mariners Cove Park', '(575) 8233637', '2021-12-03', '2027-09-27'),
('1558716998', 'Barbe Oswell', '2012-05-25 00:00:00', 'Male', '3', '51 Carpenter Street', '(332) 3097155', '2021-03-29', '2027-11-21'),
('1968128638', 'Corney Piletic', '1993-09-23 00:00:00', 'Female', '13', '2110 Pine View Trail', '(547) 3022820', '2021-04-04', '2027-05-02'),
('3521914518', 'Valerye McDougall', '2003-11-11 00:00:00', 'Male', '17', '47 Loeprich Parkway', '(675) 1015437', '2021-09-19', '2027-02-09'),
('3844551905', 'Forrest Trembley', '2000-01-19 00:00:00', 'Female', '6', '99 Lillian Hill', '(908) 4430838', '2021-12-04', '2027-05-22'),
('3910330312', 'Gilly Rothert', '1991-05-22 00:00:00', 'Male', '9', '096 Di Loreto Street', '(928) 4491403', '2022-01-12', '2027-12-05'),
('5126197940', 'Mandel Caley', '2011-01-31 00:00:00', 'Female', '2', '13826 Menomonie Parkway', '(691) 7708288', '2021-09-18', '2027-03-31'),
('5886452915', 'Sarajane Alvar', '1995-02-07 00:00:00', 'Male', '16', '9696 Granby Hill', '(554) 2015334', '2021-03-10', '2027-07-24'),
('5908951048', 'Nerti Bauldry', '2007-12-19 00:00:00', 'Female', '19', '59924 Grim Street', '(514) 4097619', '2021-06-02', '2027-09-13'),
('5986843622', 'Verina Wingfield', '2005-04-01 00:00:00', 'Female', '7', '924 Merrick Hill', '(359) 4755714', '2021-12-17', '2027-05-06'),
('6265318977', 'Waylin Finlayson', '2003-01-25 00:00:00', 'Female', '12', '038 Elmside Circle', '(481) 4137603', '2021-07-08', '2027-04-30'),
('6335349698', 'Burnaby Stapleton', '1991-01-14 00:00:00', 'Non-binary', '18', '5055 Marcy Parkway', '(159) 4833401', '2021-06-27', '2027-09-28'),
('7328471689', 'Josias McMenamie', '2014-06-22 00:00:00', 'Genderqueer', '11', '5791 Calypso Trail', '(342) 3249080', '2021-02-02', '2027-10-08'),
('7712152101', 'Carolynn Ethersey', '2000-12-01 00:00:00', 'Female', '15', '13 Judy Pass', '(777) 3849018', '2021-11-04', '2027-03-07'),
('8066959370', 'Agnes Muffen', '2003-03-24 00:00:00', 'Male', '5', '260 Mockingbird Parkway', '(598) 8130169', '2021-04-19', '2027-03-11'),
('8396333122', 'Guthry Jory', '2011-08-13 00:00:00', 'Male', '10', '4 Wayridge Hill', '(217) 4897010', '2021-08-10', '2027-09-06'),
('8599908995', 'Carny Tumielli', '1999-03-31 00:00:00', 'Agender', '20', '73 Thierer Drive', '(410) 2898086', '2021-04-05', '2027-08-31'),
('8726638002', 'Cam Duffield', '1996-03-03 00:00:00', 'Bigender', '1', '52706 Gale Park', '(644) 5625437', '2021-12-03', '2027-05-06'),
('8822227492', 'Drusilla MacKonochie', '1999-06-27 00:00:00', 'Female', '14', '60 International Park', '(237) 8978522', '2021-06-20', '2027-03-30');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `violate`
--

CREATE TABLE `violate` (
  `id_card` varchar(10) NOT NULL,
  `id_book` varchar(10) NOT NULL,
  `Content_violations` text NOT NULL,
  `form_of_sanction` text NOT NULL,
  `fines` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `authors`
--
ALTER TABLE `authors`
  ADD PRIMARY KEY (`id_authors`);

--
-- Chỉ mục cho bảng `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`id_book`);

--
-- Chỉ mục cho bảng `book_authors`
--
ALTER TABLE `book_authors`
  ADD PRIMARY KEY (`id_book`,`id_authors`),
  ADD KEY `id_authors` (`id_authors`);

--
-- Chỉ mục cho bảng `book_category`
--
ALTER TABLE `book_category`
  ADD PRIMARY KEY (`id_book`,`id_category`),
  ADD KEY `id_category` (`id_category`);

--
-- Chỉ mục cho bảng `book_liquidation`
--
ALTER TABLE `book_liquidation`
  ADD PRIMARY KEY (`id_book`,`id_book_liquidation`);

--
-- Chỉ mục cho bảng `book_positions`
--
ALTER TABLE `book_positions`
  ADD PRIMARY KEY (`id_book`,`id_position`),
  ADD KEY `id_position` (`id_position`);

--
-- Chỉ mục cho bảng `book_publish_company`
--
ALTER TABLE `book_publish_company`
  ADD PRIMARY KEY (`id_book`,`id_publisher`),
  ADD KEY `id_publisher` (`id_publisher`);

--
-- Chỉ mục cho bảng `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`id_category`);

--
-- Chỉ mục cho bảng `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id_employee`);

--
-- Chỉ mục cho bảng `loan_slip`
--
ALTER TABLE `loan_slip`
  ADD PRIMARY KEY (`id_card`,`id_book`,`id_employee`),
  ADD KEY `id_book` (`id_book`),
  ADD KEY `id_employee` (`id_employee`);

--
-- Chỉ mục cho bảng `positions`
--
ALTER TABLE `positions`
  ADD PRIMARY KEY (`id_position`);

--
-- Chỉ mục cho bảng `publish_company`
--
ALTER TABLE `publish_company`
  ADD PRIMARY KEY (`id_publisher`);

--
-- Chỉ mục cho bảng `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`id_card`);

--
-- Chỉ mục cho bảng `violate`
--
ALTER TABLE `violate`
  ADD PRIMARY KEY (`id_card`,`id_book`),
  ADD KEY `id_book` (`id_book`);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `book_authors`
--
ALTER TABLE `book_authors`
  ADD CONSTRAINT `book_authors_ibfk_1` FOREIGN KEY (`id_book`) REFERENCES `book` (`id_book`),
  ADD CONSTRAINT `book_authors_ibfk_2` FOREIGN KEY (`id_authors`) REFERENCES `authors` (`id_authors`);

--
-- Các ràng buộc cho bảng `book_category`
--
ALTER TABLE `book_category`
  ADD CONSTRAINT `book_category_ibfk_1` FOREIGN KEY (`id_book`) REFERENCES `book` (`id_book`),
  ADD CONSTRAINT `book_category_ibfk_2` FOREIGN KEY (`id_category`) REFERENCES `category` (`id_category`);

--
-- Các ràng buộc cho bảng `book_liquidation`
--
ALTER TABLE `book_liquidation`
  ADD CONSTRAINT `book_liquidation_ibfk_1` FOREIGN KEY (`id_book`) REFERENCES `book` (`id_book`);

--
-- Các ràng buộc cho bảng `book_positions`
--
ALTER TABLE `book_positions`
  ADD CONSTRAINT `book_positions_ibfk_1` FOREIGN KEY (`id_book`) REFERENCES `book` (`id_book`),
  ADD CONSTRAINT `book_positions_ibfk_2` FOREIGN KEY (`id_position`) REFERENCES `positions` (`id_position`);

--
-- Các ràng buộc cho bảng `book_publish_company`
--
ALTER TABLE `book_publish_company`
  ADD CONSTRAINT `book_publish_company_ibfk_1` FOREIGN KEY (`id_book`) REFERENCES `book` (`id_book`),
  ADD CONSTRAINT `book_publish_company_ibfk_2` FOREIGN KEY (`id_publisher`) REFERENCES `publish_company` (`id_publisher`);

--
-- Các ràng buộc cho bảng `loan_slip`
--
ALTER TABLE `loan_slip`
  ADD CONSTRAINT `loan_slip_ibfk_1` FOREIGN KEY (`id_card`) REFERENCES `student` (`id_card`),
  ADD CONSTRAINT `loan_slip_ibfk_2` FOREIGN KEY (`id_book`) REFERENCES `book` (`id_book`),
  ADD CONSTRAINT `loan_slip_ibfk_3` FOREIGN KEY (`id_employee`) REFERENCES `employee` (`id_employee`);

--
-- Các ràng buộc cho bảng `violate`
--
ALTER TABLE `violate`
  ADD CONSTRAINT `violate_ibfk_1` FOREIGN KEY (`id_card`) REFERENCES `student` (`id_card`),
  ADD CONSTRAINT `violate_ibfk_2` FOREIGN KEY (`id_book`) REFERENCES `book` (`id_book`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
