--SpringBoot增删改查学习数据库
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `cid` int(11) NOT NULL,
  `cname` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `tid` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`cid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES (1, '语文', 1);
INSERT INTO `course` VALUES (2, '数学', 2);
INSERT INTO `course` VALUES (3, '英语', 3);
INSERT INTO `course` VALUES (4, '物理', 4);
INSERT INTO `course` VALUES (5, '化学', 5);
INSERT INTO `course` VALUES (6, '政治', 6);
INSERT INTO `course` VALUES (7, '历史', 7);
INSERT INTO `course` VALUES (8, '生物', 8);
INSERT INTO `course` VALUES (9, '地理', 9);

-- ----------------------------
-- Table structure for sc
-- ----------------------------
DROP TABLE IF EXISTS `sc`;
CREATE TABLE `sc`  (
  `sid` int(11) NOT NULL,
  `cid` int(11) NOT NULL,
  `score` int(11) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sc
-- ----------------------------
INSERT INTO `sc` VALUES (1, 1, 80);
INSERT INTO `sc` VALUES (2, 2, 75);
INSERT INTO `sc` VALUES (3, 4, 65);
INSERT INTO `sc` VALUES (4, 4, 87);
INSERT INTO `sc` VALUES (5, 6, 90);
INSERT INTO `sc` VALUES (6, 6, 60);
INSERT INTO `sc` VALUES (7, 7, 75);
INSERT INTO `sc` VALUES (8, 8, 82);
INSERT INTO `sc` VALUES (9, 9, 78);

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `sid` int(11) NOT NULL AUTO_INCREMENT COMMENT '学生ID',
  `sname` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `sage` int(11) NULL DEFAULT NULL COMMENT '年龄',
  `ssex` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '性别',
  `createtime` datetime(0) NOT NULL COMMENT '创建时间',
  `state` int(11) NULL DEFAULT 0 COMMENT '状态',
  PRIMARY KEY (`sid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 22 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (6, '李四', 16, '女', '2020-12-03 11:03:03', 0);
INSERT INTO `student` VALUES (7, '阿炳', 15, '男', '2020-12-03 15:44:20', 0);
INSERT INTO `student` VALUES (8, '呵呵', 18, '男', '2020-12-03 15:46:31', 0);
INSERT INTO `student` VALUES (9, '阿某', 16, '女', '2020-12-01 15:45:01', 0);
INSERT INTO `student` VALUES (10, '呜呜', 16, '女', '2020-12-03 15:46:47', 0);
INSERT INTO `student` VALUES (13, '张三', 16, '男', '2020-12-03 15:50:27', 0);
INSERT INTO `student` VALUES (14, '李四', 15, '女', '2020-12-03 15:50:42', 0);
INSERT INTO `student` VALUES (15, '王五', 16, '男', '2020-12-03 15:51:04', 0);
INSERT INTO `student` VALUES (16, '阿卜', 26, '男', '2020-12-03 09:52:41', 0);
INSERT INTO `student` VALUES (17, '阿卜01', 20, '男', '2020-12-03 09:53:55', 0);
INSERT INTO `student` VALUES (18, '啦啦', 29, '女', '2020-12-03 09:56:41', 0);
INSERT INTO `student` VALUES (19, '露露', 22, '女', '2020-12-03 09:58:29', 0);
INSERT INTO `student` VALUES (20, '阿女1', 17, '女', '2020-12-04 07:21:32', 0);
INSERT INTO `student` VALUES (21, '阿女2', 17, '女', '2020-12-04 07:21:58', 0);

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`  (
  `tid` int(11) NOT NULL,
  `tname` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`tid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES (1, '阿兰');
INSERT INTO `teacher` VALUES (2, '阿彪');

SET FOREIGN_KEY_CHECKS = 1;
