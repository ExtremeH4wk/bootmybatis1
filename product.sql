/*
 Navicat Premium Data Transfer

 Source Server         : bootdemo
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : localhost:3306
 Source Schema         : product

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : 65001

 Date: 02/08/2020 17:06:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `orderNo` int(11) NOT NULL AUTO_INCREMENT,
  `orderDate` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `userId` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`orderNo`) USING BTREE,
  INDEX `userIdFK`(`userId`) USING BTREE,
  CONSTRAINT `userIdFK` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES (1, NULL, NULL);

-- ----------------------------
-- Table structure for orderdata
-- ----------------------------
DROP TABLE IF EXISTS `orderdata`;
CREATE TABLE `orderdata`  (
  `oD_Id` int(11) NOT NULL AUTO_INCREMENT,
  `orderNo` int(11) NULL DEFAULT NULL,
  `p_id` int(11) NULL DEFAULT NULL,
  `p_count` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`oD_Id`) USING BTREE,
  INDEX `orderNoFK`(`orderNo`) USING BTREE,
  INDEX `p_idFK`(`p_id`) USING BTREE,
  CONSTRAINT `orderNoFK` FOREIGN KEY (`orderNo`) REFERENCES `order` (`orderNo`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `p_idFK` FOREIGN KEY (`p_id`) REFERENCES `product` (`p_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product`  (
  `p_id` int(12) NOT NULL AUTO_INCREMENT,
  `p_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `pic_data` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `p_text` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `p_typeId` int(11) NULL DEFAULT NULL,
  `price` double(10, 2) UNSIGNED NULL DEFAULT NULL,
  PRIMARY KEY (`p_id`) USING BTREE,
  UNIQUE INDEX `aP_nameOnly`(`p_name`) USING BTREE,
  INDEX `typeIdFK`(`p_typeId`) USING BTREE,
  CONSTRAINT `typeIdFK` FOREIGN KEY (`p_typeId`) REFERENCES `type` (`typeId`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 63 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES (1, '时光机', 'http://127.0.0.1:8888/all/时光机.jpg', '哆啦A梦的飞毯型时光机。以前是以两根操纵杆操纵，现在则是以按钮操作，也有声控功能。可以往来于时空之间，长2.2公尺，宽1.6公尺，高1.28公尺，重538公斤。是哆啦A梦道具中最受欢迎的第2名。本来预定是在公元2008年发明，但目前看来绝无可能。', 1, 19999.22);
INSERT INTO `product` VALUES (2, '时间空间变换器', 'http://127.0.0.1:8888/all/时间空间变换器.jpg', '外观是两个相同机器接合起来。用粉笔画出一个范围，再调整右边机器的时间旋钮，就可以将范围内的空间与过去某时间的空间对调。但不知道左边的机器是拿来做什么的。', 1, 14752.00);
INSERT INTO `product` VALUES (3, '时光电视', 'http://127.0.0.1:8888/all/时光电视.jpg', '可在电视上看到任何时间所发生的事情。', 1, 178.00);
INSERT INTO `product` VALUES (4, '任意门', 'http://127.0.0.1:8888/all/任意门.jpg', '只要心中想着想去的地点，电脑就会传达并歪曲所在地与目的地间的空间而将两地靠拢，跨过门就可以到达。但是不能去距离十光年以上的行星，或者是电脑地图上没有的地区。', 1, 25858.00);
INSERT INTO `product` VALUES (5, '时光腰带', 'http://127.0.0.1:8888/all/时光腰带.jpg', '又名“时光表”、“时光带”，也算是时光机的一种，但是，不能改变地点，只能改变时间。', 1, 58.00);
INSERT INTO `product` VALUES (6, '时光购物机', 'http://127.0.0.1:8888/all/时光购物机.jpg', '把钱丢进去，拉一下把手，依照显示盘上的公元年代，可以购买过去或未来的东西。东西会维持当时的价格，但是如果当时并没有这种物品的话，物品就出不来了。', 1, 968.00);
INSERT INTO `product` VALUES (7, '时光布', 'http://127.0.0.1:8888/all/时光布.jpg', '是一面红色、一面蓝色绘有许多时钟图案的布。用红色的一面把东西包在里面时，就会把物品变得更新；如果以蓝色的方向把东西盖在里面，就会变得更旧。名列哆啦A梦最受欢迎道具第4名。又名”时光包巾”、”时光包袱巾”。', 1, 87.00);
INSERT INTO `product` VALUES (8, '回忆放映机', 'http://127.0.0.1:8888/all/回忆放映机.jpg', '一个可戴在头上的东西以及连接的放映机，把它戴在头上设定好时间，就能将那个人那段时间看到的东西放映出来。', 1, 587.00);
INSERT INTO `product` VALUES (9, '时间密封球罐', 'http://127.0.0.1:8888/all/时间密封球罐.jpg', '一个貌似金属制，直径约近一公尺大小的球型物，可分开为两个半球，中为空心可放置物品，将物品放入后关上，里面的物品就可以原封不动永远保留下去。', 1, 45.00);
INSERT INTO `product` VALUES (10, '时间超速装置', 'http://127.0.0.1:8888/all/时间超速装置.jpg', '一个约当手大小的卷输，使用者先调整每一圈代表的时间单位，再转它，就能跳过某段时间，直接到之后的时间。跳过的时间不能收回，除非该机器坏掉。', 1, 4564123.00);
INSERT INTO `product` VALUES (11, '空间跳跃笔', 'http://127.0.0.1:8888/all/空间跳跃笔.jpg', '一支笔。用它在墙上等地上画一个圆圈，并说出要连接的地点，就可以透过这个圆圈，直接到达指定的地点。用一般的橡皮擦就可擦掉，擦掉之后，两个地点的连接就会消失。', 1, 8552.00);
INSERT INTO `product` VALUES (12, '竹蜻蜓', 'http://127.0.0.1:8888/all/竹蜻蜓.jpg', '是最常被哆啦A梦使用的道具。只要把它放置在身体任何一部，就可依自己意思在天空中翱翔。内藏超小型电池，可时速八十公里连续飞行八小时。若是间断飞行，还可撑更久！', 2, 525236.00);
INSERT INTO `product` VALUES (13, '任意气球', 'http://127.0.0.1:8888/all/任意气球.jpg', '一个小型的气球。拿在手上，在气球上写上要去的地方，气球就会带人飞到那个地方，一个气球适用于一人，且只能使用单次。', 2, 3663.00);
INSERT INTO `product` VALUES (14, '飞行包裹', 'http://127.0.0.1:8888/all/飞行包裹.jpg', '只要在这行李牌上写上收件人的姓名住址，行李就会自动飞到收件处去。', 2, 36.00);
INSERT INTO `product` VALUES (15, '爆炸胡椒', 'http://127.0.0.1:8888/all/爆炸胡椒.jpg', '一瓶胡椒。把它对着其他人或动物撒并且说出自己要去的地方，对方就会打喷嚏并且以此能量将自己送到指定的地点去。但如果不指定地点的话它会一直飞不下来。另外，如果不是人而是其他小动物用可能会因能量不足而到不了指定地点。', 2, 3.00);
INSERT INTO `product` VALUES (16, '冒险降落伞', 'http://127.0.0.1:8888/all/冒险降落伞.jpg', '装上这个以后，就可以自由的操控纸飞机。', 2, 3683.00);
INSERT INTO `product` VALUES (17, '小鸟帽', 'http://127.0.0.1:8888/all/小鸟帽.jpg', '戴上这个以后，鸟会以为你是同类，互相关系变很好。同时也会长出翅膀，可以飞。', 2, 7822.00);
INSERT INTO `product` VALUES (18, '空中漫步鞋', 'http://127.0.0.1:8888/all/空中漫步鞋.jpg', '穿上鞋子以后，可以踩在空气上面，也就是可以在空气上自由漫步。', 2, 683.00);
INSERT INTO `product` VALUES (19, '凝云瓦斯', 'http://127.0.0.1:8888/all/凝云瓦斯.jpg', '可以把云凝固起来，使人可以在上面走动、玩耍。', 2, 524.00);
INSERT INTO `product` VALUES (20, '鼻子气球', 'http://127.0.0.1:8888/all/鼻子气球.jpg', '用鼻子呼气就可以吹出五颜六色的泡泡来。如果泡泡很大，就有比较强的浮力，或许还能把人带上天空；感冒时用，就只会产生很多小泡泡而已。有红、蓝、黄、绿4种。', 2, 386.00);
INSERT INTO `product` VALUES (21, '放人风筝', 'http://127.0.0.1:8888/all/放人风筝.jpg', '风筝的外观写着“龙”字。把风筝放在地板上，人就会自动浮到天空上去。', 2, 3.00);
INSERT INTO `product` VALUES (22, '房屋蜻蜓', 'http://127.0.0.1:8888/all/房屋蜻蜓.jpg', '竹蜻蜓的放大版，可以放在屋顶使房屋在天空飞行。', 2, 25245.00);
INSERT INTO `product` VALUES (23, '风神扇子', 'http://127.0.0.1:8888/all/风神扇子.jpg', '一把扇子，使用它可以产生比一般扇子强很多倍的大风，人可以利用它来飞行。', 2, 254255.00);
INSERT INTO `product` VALUES (24, '记忆面包', 'http://127.0.0.1:8888/all/记忆面包.jpg', '只要压在要背的东西上再吃下去，就可以轻轻松松的把那东西背起来。', 3, 8.00);
INSERT INTO `product` VALUES (25, '天才头盔', 'http://127.0.0.1:8888/all/天才头盔.png', '外观是类似在焊接时所戴的头盔。戴上它，就可以灵思泉涌、设计改造，自动产出蓝图。', 3, 5.00);
INSERT INTO `product` VALUES (26, '技术手套', 'http://127.0.0.1:8888/all/技术手套.png', '这个手套的手指可以变成各种工具替我们做事。搭配”天才头盔\"用。', 3, 6368.00);
INSERT INTO `product` VALUES (27, '电脑原子笔', 'http://127.0.0.1:8888/all/电脑原子笔.jpg', '在家的墙壁上画个洞，就会自动通到外面去，还会自动帮你穿好鞋子，只是目的地无法预料。在外面画个洞，又可以回到家里。', 3, 224.00);
INSERT INTO `product` VALUES (28, '翻译凉粉', 'http://127.0.0.1:8888/all/翻译凉粉.jpg', '吃下去以后，无论何种语言，本来不能用语言沟通的两人，就可以互相沟通了。', 3, 25424.00);
INSERT INTO `product` VALUES (29, '复制头脑', 'http://127.0.0.1:8888/all/复制头脑.jpg', '一般的机器人，使用电子头脑操作机械手脚。而生物机器人，则是以人的脑，操作动物的手脚。把这个仪器先放在自己头上，就会吸收你的智慧、知识、思考等等，然后在将这个仪器放在动物身上，动物就会变成你的生物机器人了。', 3, 24.00);
INSERT INTO `product` VALUES (30, '人体书皮', 'http://127.0.0.1:8888/all/人体书皮.jpg', '外观是个写着「BOOK」的大型书背。只要让人戴上它，并写上书名，他就会变成书，口述内容。', 3, 544.00);
INSERT INTO `product` VALUES (31, '让步帽', 'http://127.0.0.1:8888/all/让步帽.jpg', '外形为一顶单车运动员戴的帽子，只要戴着它，调整上面刻度，可以使任何人变得和使用者一样。', 3, 254.00);
INSERT INTO `product` VALUES (32, '拷贝镜', 'http://127.0.0.1:8888/all/拷贝镜.jpg', '只要打开开关，以任何东西照一下该镜子，镜子就会帮你复制出物品（包括人也可以复制），但复制的物品会左右相反。另外镜子之中有空间，如果不慎会掉到里面被困住。', 3, 254.00);
INSERT INTO `product` VALUES (33, '记忆磁盘', 'http://127.0.0.1:8888/all/记忆磁盘.jpg', '可以叫出来脑中的记忆。可以用特制的屏幕显示出来。如果记忆不太清晰的话，显示出来的图像也会模糊，此时，用布擦一擦光盘即可。', 3, 78578.00);
INSERT INTO `product` VALUES (34, '时门', 'http://127.0.0.1:8888/all/时门.jpg', '按下这个，时间就会过得很慢。就与水流动的道理一样。', 3, 24.00);
INSERT INTO `product` VALUES (35, '提高效率丸', 'http://127.0.0.1:8888/all/提高效率丸.jpg', '喝下这个药水，无论做甚么都会做得很快、很有效率。但正确性又是另一回事了。', 3, 27828.00);
INSERT INTO `product` VALUES (36, '日程钟', 'http://127.0.0.1:8888/all/日程钟.jpg', '先安排时间表，几点几分到几点几分做甚么，接着再做什么。把这些写进卡片，插进闹钟里，他就会监督把卡片插进照片里的人完成该时间表。', 3, 2524.00);
INSERT INTO `product` VALUES (37, '幸运丸', 'http://127.0.0.1:8888/all/幸运丸.jpg', '只要遇到幸运的人，吃下这个药丸再去摸他，幸运就会传过来喔', 3, 5275.00);
INSERT INTO `product` VALUES (38, '摔跤客', 'http://127.0.0.1:8888/all/摔跤客.jpg', '别小看他喔！只要在他背后投入十元，就可以让人跌倒三次。如果要取消，则要付100元。', 4, 5275.00);
INSERT INTO `product` VALUES (39, '空气炮', 'http://127.0.0.1:8888/all/空气炮.png', '利用空气压力的道具，只要喊声”碰\"，就能聚集空气向敌人发射，但威力比\"空气枪\"强多了。', 4, 25727.00);
INSERT INTO `product` VALUES (40, '空气手枪', 'http://127.0.0.1:8888/all/空气手枪.jpg', '套在手指头上面，然后说\"碰\"，就能聚集空气向敌人发射。', 4, 527827.00);
INSERT INTO `product` VALUES (41, '无敌炮台', 'http://127.0.0.1:8888/all/无敌炮台.jpg', '设置好炮台后，只要喊\"发射”，就能够准确的击中目标。目标会全身焦黑，可见威力强大。有雷达可以扫描意图接近、破坏者。', 4, 27578.00);
INSERT INTO `product` VALUES (42, '睡意吸收枪', 'http://127.0.0.1:8888/all/睡意吸收枪.jpg', '按一按这个枪的橡胶枪柄，睡意就会被吸走。而按下按钮，就可以射出睡意，被射中的人会呼呼大睡。', 4, 25772.00);
INSERT INTO `product` VALUES (43, '换装照相机', 'http://127.0.0.1:8888/all/换装照相机.jpg', '把衣服的设计图放进相机里，对准目标物，对好了按快门，该衣服就会穿在目标物上。原理很简单，就像积木一样，同样的积木组合起来会有不同的造型，这个照相机便是把各种衣服的分子组合起来。任何设计都行。', 4, 257275.00);
INSERT INTO `product` VALUES (44, '狼人面霜', 'http://127.0.0.1:8888/all/狼人面霜.jpg', '只要涂上这个面霜后，再看到圆形的物体，就会变成狼人。', 4, 2577.00);
INSERT INTO `product` VALUES (45, '打开就下雨的雨伞', 'http://127.0.0.1:8888/all/打开就下雨的雨伞.jpg', '用途如其名。', 4, 25772.00);
INSERT INTO `product` VALUES (46, '搔痒跳蚤', 'http://127.0.0.1:8888/all/搔痒跳蚤.jpg', '把这粉末洒向对方，就会有机器跳蚤跑出，对方就会很痒。', 4, 828725.00);
INSERT INTO `product` VALUES (47, '报应酒', 'http://127.0.0.1:8888/all/报应酒.jpg', '滴上一滴，受欺负的人或动物就会在晚上变成幽灵，找人报仇。', 4, 258258.00);
INSERT INTO `product` VALUES (48, '格列弗隧道', 'http://127.0.0.1:8888/all/格列弗隧道.jpg', '外观是一端大一端小的渠道，从大的一端进去、小的一端出来，就会变小，反之就可变回来。', 5, 25727.00);
INSERT INTO `product` VALUES (49, '缩小灯', 'http://127.0.0.1:8888/all/缩小灯.jpg', '只要照了它，东西就会变小。与其功能相反的是\"放大灯\"。', 5, 2872782.00);
INSERT INTO `product` VALUES (50, '放大灯', 'http://127.0.0.1:8888/all/放大灯.jpg', '它的功能与\"缩小灯”相反，被照到就可以把物品放大。', 5, 572727.00);
INSERT INTO `product` VALUES (51, '阿拉丁神灯', 'http://127.0.0.1:8888/all/阿拉丁神灯.jpg', '擦了神灯，烟雾机器人便会出来。谁擦神灯，他就听谁的话。按\"取消\"按钮可以取消对他的命令。', 5, 27575.00);
INSERT INTO `product` VALUES (52, '如果电话亭', 'http://127.0.0.1:8888/all/如果电话亭.jpg', '它是一种实验室，让你看看实验后的成果。只要进入电话亭对着话筒说\"如果……\"，就会发生那样的事。', 5, 25777.00);
INSERT INTO `product` VALUES (53, '遗忘物传送机', 'http://127.0.0.1:8888/all/遗忘物传送机.jpg', '可以把忘记带的东西直接送过去的道具。分成摄像头与平台两部分，摄像头可以观察目标人的情形，而将物品放在平台上，就可以把物品送给目标人。', 5, 25757.00);
INSERT INTO `product` VALUES (54, '圆梦天使', 'http://127.0.0.1:8888/all/圆梦天使.jpg', '诚心诚意地求它保佑你，你的愿望就会实现。', 5, 572757.00);
INSERT INTO `product` VALUES (55, '超能力帽', 'http://127.0.0.1:8888/all/超能力帽.jpg', '可以使出三种技能。一、念力：不需用手就可使出力量移动物体。二、瞬间移动；消失身影的同时在他处出现。三、透视：从远处即可透视遮蔽物内的物体。', 5, 275257.00);
INSERT INTO `product` VALUES (56, '颠倒时针', 'http://127.0.0.1:8888/all/颠倒时针.jpg', '被它碰过的东西，作用就会颠倒。', 5, 272754.00);
INSERT INTO `product` VALUES (57, '快速发条', 'http://127.0.0.1:8888/all/快速发条.jpg', '只要把发条放在目标人上转一转，就能使人高速运动。', 5, 41417.00);
INSERT INTO `product` VALUES (58, '透明斗篷', 'http://127.0.0.1:8888/all/透明斗篷.jpg', '披上这个斗篷，可以让身体透明，不被人看见。', 5, 17275.00);
INSERT INTO `product` VALUES (59, '穿透环', 'http://127.0.0.1:8888/all/穿透环.jpg', '把这个贴在墙上，就能直接穿越墙壁。', 5, 477255.00);
INSERT INTO `product` VALUES (60, '飞毛腿乳液', 'http://127.0.0.1:8888/all/飞毛腿乳液.jpg', '把这个涂在脚上，就会跑得很快。但是时效很短。', 5, 17525.00);
INSERT INTO `product` VALUES (61, '警犬鼻', 'http://127.0.0.1:8888/all/警犬鼻.jpg', '把它装在鼻子上，就能拥有性能相当好的鼻子，连上了车的人味道都能追踪到！', 5, 27247.00);
INSERT INTO `product` VALUES (62, '随意透视镜', 'http://127.0.0.1:8888/all/随意透视镜.jpg', '可以穿过任何阻碍物，看到里面的风景。例如，戴上这副眼镜玩扑克牌的话，就可以看到对方的手牌，具有透视效果。', 5, 257417.00);

-- ----------------------------
-- Table structure for type
-- ----------------------------
DROP TABLE IF EXISTS `type`;
CREATE TABLE `type`  (
  `typeId` int(11) NOT NULL AUTO_INCREMENT,
  `typeName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`typeId`) USING BTREE,
  UNIQUE INDEX `typeNameOnly`(`typeName`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of type
-- ----------------------------
INSERT INTO `type` VALUES (3, '学习类');
INSERT INTO `type` VALUES (4, '整蛊类');
INSERT INTO `type` VALUES (1, '时空类');
INSERT INTO `type` VALUES (5, '神秘类');
INSERT INTO `type` VALUES (2, '飞行类');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `userId` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `userName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `passWord` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`userId`) USING BTREE,
  UNIQUE INDEX `userIdOnly`(`userId`) USING BTREE,
  UNIQUE INDEX `userNameOnly`(`userName`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('lzq123', 'lzq', '123');

SET FOREIGN_KEY_CHECKS = 1;
