/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50714
Source Host           : 127.0.0.1:3306
Source Database       : shopmall

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2018-03-05 17:18:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for act
-- ----------------------------
DROP TABLE IF EXISTS `act`;
CREATE TABLE `act` (
  `id` bigint(20) NOT NULL COMMENT '砍价活动id',
  `actname` varchar(255) NOT NULL COMMENT '活动名称',
  `actdes` varchar(255) NOT NULL COMMENT '活动描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for actaexpand
-- ----------------------------
DROP TABLE IF EXISTS `actaexpand`;
CREATE TABLE `actaexpand` (
  `id` bigint(20) NOT NULL COMMENT '活动拓展表id',
  `expandname` varchar(255) NOT NULL COMMENT '名称',
  `expandres` varchar(255) NOT NULL COMMENT '值',
  `actid` bigint(20) NOT NULL COMMENT '活动id',
  `status` int(11) NOT NULL,
  `createtime` datetime NOT NULL,
  `updatetime` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for actimg
-- ----------------------------
DROP TABLE IF EXISTS `actimg`;
CREATE TABLE `actimg` (
  `id` bigint(20) NOT NULL COMMENT '活动图id',
  `actid` bigint(20) NOT NULL COMMENT '活动id',
  `imgurl` varchar(255) NOT NULL COMMENT '活动图片url地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for actorganizer
-- ----------------------------
DROP TABLE IF EXISTS `actorganizer`;
CREATE TABLE `actorganizer` (
  `id` bigint(20) NOT NULL COMMENT '活动发起表id',
  `actid` bigint(20) NOT NULL COMMENT '活动id',
  `usrid` bigint(20) NOT NULL COMMENT '用户id',
  `assisid` bigint(20) NOT NULL COMMENT '协助砍价人列表id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for acttype
-- ----------------------------
DROP TABLE IF EXISTS `acttype`;
CREATE TABLE `acttype` (
  `id` bigint(20) NOT NULL,
  `typename` varchar(255) NOT NULL COMMENT '活动类型名称',
  `status` int(11) NOT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `id` bigint(20) NOT NULL COMMENT '收货地址id',
  `usrid` bigint(20) NOT NULL COMMENT '用户id',
  `privince` varchar(255) NOT NULL COMMENT '省',
  `city` varchar(255) NOT NULL COMMENT '市',
  `district` varchar(255) NOT NULL COMMENT '区',
  `address` varchar(255) NOT NULL COMMENT '详细地址描述',
  `status` int(11) NOT NULL COMMENT '状态',
  `createtime` datetime NOT NULL COMMENT '创建时间',
  `updatetime` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for attr
-- ----------------------------
DROP TABLE IF EXISTS `attr`;
CREATE TABLE `attr` (
  `id` bigint(20) NOT NULL COMMENT '属性名id',
  `attrname` varchar(255) NOT NULL COMMENT '属性名',
  `typeid` bigint(20) NOT NULL COMMENT '类别id',
  `attrpid` bigint(20) NOT NULL COMMENT '父属性id',
  `status` int(11) NOT NULL COMMENT '状态',
  `createtime` datetime NOT NULL COMMENT '创建时间',
  `updatetime` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for attrres
-- ----------------------------
DROP TABLE IF EXISTS `attrres`;
CREATE TABLE `attrres` (
  `id` bigint(20) NOT NULL COMMENT '属性值id',
  `attrres` varchar(255) NOT NULL COMMENT '属性值名称',
  `attrid` bigint(20) NOT NULL COMMENT '属性名id',
  `status` int(11) NOT NULL COMMENT '状态',
  `createtime` datetime NOT NULL,
  `updatetime` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for cutslist
-- ----------------------------
DROP TABLE IF EXISTS `cutslist`;
CREATE TABLE `cutslist` (
  `id` bigint(20) NOT NULL COMMENT '助力表id',
  `faqirenid` bigint(20) NOT NULL COMMENT '发起人id',
  `usrid` bigint(20) NOT NULL COMMENT '协助者id',
  `cutprice` decimal(10,0) NOT NULL COMMENT '砍价金额',
  `say` varchar(255) NOT NULL COMMENT '砍价助力描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for good
-- ----------------------------
DROP TABLE IF EXISTS `good`;
CREATE TABLE `good` (
  `id` bigint(20) NOT NULL COMMENT '商品表id',
  `goodname` varchar(255) NOT NULL COMMENT '商品名称',
  `gooddes` varchar(255) NOT NULL COMMENT '商品基本描述',
  `typeid` bigint(20) NOT NULL COMMENT '商品类型id',
  `shopid` bigint(20) NOT NULL COMMENT '店铺id',
  `spusale` int(11) NOT NULL COMMENT '店铺spu销量',
  `saynum` int(11) NOT NULL COMMENT '评论数',
  `status` int(11) NOT NULL COMMENT '状态',
  `createtime` datetime NOT NULL COMMENT '创建时间',
  `updatetime` datetime NOT NULL COMMENT '更新时间',
  `goodfistimg` varchar(255) NOT NULL COMMENT '商品显示首图',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for goodattrrela
-- ----------------------------
DROP TABLE IF EXISTS `goodattrrela`;
CREATE TABLE `goodattrrela` (
  `id` bigint(20) NOT NULL COMMENT '商品与属性关系表id',
  `goodid` bigint(20) NOT NULL COMMENT '商品id',
  `attrid` bigint(20) NOT NULL COMMENT '属性名id',
  `attrresid` bigint(20) NOT NULL COMMENT '属性值id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for goodattrsai
-- ----------------------------
DROP TABLE IF EXISTS `goodattrsai`;
CREATE TABLE `goodattrsai` (
  `goodid` bigint(20) NOT NULL COMMENT '商品id',
  `attrids` bigint(20) NOT NULL COMMENT '商品属性值集合',
  `id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for goodimg
-- ----------------------------
DROP TABLE IF EXISTS `goodimg`;
CREATE TABLE `goodimg` (
  `id` bigint(20) NOT NULL COMMENT '图片id',
  `goodid` bigint(20) NOT NULL COMMENT '商品id',
  `imgurl` varchar(255) NOT NULL COMMENT '图片服务器路径',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` bigint(20) NOT NULL COMMENT '订单表id',
  `ordernum` int(11) NOT NULL COMMENT '订单数量',
  `payprice` decimal(10,0) NOT NULL COMMENT '应付款金额',
  `ispay` int(11) NOT NULL COMMENT '是否已经付款',
  `paytime` datetime NOT NULL COMMENT '付款时间',
  `isdeliver` int(11) NOT NULL COMMENT '是否发货',
  `delivertime` datetime NOT NULL COMMENT '发货时间',
  `isreceipt` int(11) NOT NULL COMMENT '是否收货',
  `receipttime` datetime NOT NULL COMMENT '发货时间',
  `isevaluate` int(11) NOT NULL COMMENT '是否已经评价',
  `evaluatetime` datetime NOT NULL COMMENT '评价时间',
  `isrefound` int(11) NOT NULL COMMENT '是否退货',
  `refoundtime` datetime NOT NULL COMMENT '退货时间',
  `status` int(11) NOT NULL COMMENT '状态',
  `createtime` datetime NOT NULL,
  `updatetime` datetime NOT NULL,
  `shopid` int(11) NOT NULL COMMENT '店铺id',
  `distype` int(11) NOT NULL COMMENT '配送方式，1，到店自取，2，快递',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for ordergood
-- ----------------------------
DROP TABLE IF EXISTS `ordergood`;
CREATE TABLE `ordergood` (
  `id` bigint(20) NOT NULL COMMENT '订单商品表id',
  `orderid` bigint(20) NOT NULL COMMENT '订单id',
  `goodid` bigint(20) NOT NULL COMMENT '商品id',
  `goodnum` int(11) NOT NULL COMMENT '订单商品数量',
  `goodprice` decimal(10,0) NOT NULL COMMENT '订单价格',
  `status` int(11) NOT NULL,
  `createtime` datetime NOT NULL,
  `updatetime` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for redpacslist
-- ----------------------------
DROP TABLE IF EXISTS `redpacslist`;
CREATE TABLE `redpacslist` (
  `id` bigint(20) NOT NULL,
  `faqirenid` bigint(20) NOT NULL COMMENT '发起人',
  `usrid` bigint(20) NOT NULL COMMENT '协助者',
  `redprice` decimal(10,0) NOT NULL COMMENT '协助红包金额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for shipcar
-- ----------------------------
DROP TABLE IF EXISTS `shipcar`;
CREATE TABLE `shipcar` (
  `id` bigint(20) NOT NULL COMMENT '购物车表id',
  `usrid` bigint(20) NOT NULL COMMENT '用户id',
  `status` int(11) NOT NULL,
  `createtime` datetime NOT NULL,
  `updatetime` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for shipcargoods
-- ----------------------------
DROP TABLE IF EXISTS `shipcargoods`;
CREATE TABLE `shipcargoods` (
  `id` bigint(20) NOT NULL COMMENT '购物车商品表id',
  `shipcarid` bigint(20) NOT NULL COMMENT '购物车id',
  `shopid` bigint(20) NOT NULL COMMENT '店铺id',
  `goodid` bigint(20) NOT NULL COMMENT '商品id',
  `goodnum` int(11) NOT NULL COMMENT '商品数量',
  `goodattrs` varchar(255) NOT NULL COMMENT '商品属性',
  `status` int(11) NOT NULL,
  `createtime` datetime NOT NULL,
  `updatetime` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for shop
-- ----------------------------
DROP TABLE IF EXISTS `shop`;
CREATE TABLE `shop` (
  `id` bigint(20) NOT NULL COMMENT '店铺信息id',
  `shopname` varchar(255) NOT NULL COMMENT '店铺名称',
  `shopdes` varchar(255) NOT NULL COMMENT '店铺基本描述',
  `shopaddrress` varchar(255) NOT NULL COMMENT '店铺地址',
  `shoptel` varchar(255) NOT NULL COMMENT '店铺联系电话',
  `status` int(11) NOT NULL COMMENT '状态',
  `createtime` datetime NOT NULL COMMENT '创建时间',
  `updatetime` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for shopexpand
-- ----------------------------
DROP TABLE IF EXISTS `shopexpand`;
CREATE TABLE `shopexpand` (
  `id` bigint(20) NOT NULL COMMENT '店铺拓张信息表id',
  `shopid` bigint(20) NOT NULL COMMENT '店铺id',
  `expandname` varchar(255) NOT NULL COMMENT '拓展信息名',
  `expandinfo` varchar(255) NOT NULL COMMENT '拓展信息值',
  `status` int(11) NOT NULL COMMENT '状态',
  `createtime` datetime NOT NULL COMMENT '创建时间',
  `updatetime` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sku
-- ----------------------------
DROP TABLE IF EXISTS `sku`;
CREATE TABLE `sku` (
  `id` bigint(20) NOT NULL COMMENT 'sku表id',
  `goodid` bigint(20) NOT NULL COMMENT '商品id',
  `skuattr` varchar(255) NOT NULL COMMENT 'sku属性集合',
  `price` decimal(10,0) NOT NULL COMMENT '价格',
  `num` int(11) NOT NULL COMMENT '数量',
  `skusale` int(11) NOT NULL COMMENT 'sku销售数量',
  `status` int(11) NOT NULL,
  `createtime` datetime NOT NULL,
  `updatetime` datetime NOT NULL,
  `cutprice` decimal(10,0) NOT NULL COMMENT '折扣价',
  `goodimgid` bigint(20) NOT NULL COMMENT '商品描述图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for token
-- ----------------------------
DROP TABLE IF EXISTS `token`;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL,
  `token` varchar(255) NOT NULL COMMENT '用户令牌',
  `expire` int(11) NOT NULL COMMENT '过期时间，秒',
  `stauts` int(11) NOT NULL COMMENT '状态',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '更新时间',
  `usrid` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for type
-- ----------------------------
DROP TABLE IF EXISTS `type`;
CREATE TABLE `type` (
  `id` bigint(20) NOT NULL COMMENT '商品分类id',
  `typename` varchar(255) NOT NULL COMMENT '类别名称',
  `typeparentid` bigint(20) NOT NULL COMMENT '分类父分类',
  `shopid` bigint(20) NOT NULL COMMENT '店铺id',
  `status` int(11) NOT NULL COMMENT '状态',
  `createtime` datetime NOT NULL COMMENT '创建时间',
  `updatetime` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for usr
-- ----------------------------
DROP TABLE IF EXISTS `usr`;
CREATE TABLE `usr` (
  `id` bigint(20) NOT NULL COMMENT '用户id',
  `account` varchar(255) DEFAULT NULL COMMENT '用户账号',
  `pwd` varchar(255) DEFAULT NULL COMMENT '用户密码',
  `status` int(11) NOT NULL COMMENT '状态，1，正常；2，被删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for usrexpand
-- ----------------------------
DROP TABLE IF EXISTS `usrexpand`;
CREATE TABLE `usrexpand` (
  `id` bigint(20) NOT NULL COMMENT '用户信息拓展表id',
  `expand_name` varchar(255) NOT NULL COMMENT '拓展信息名',
  `expand_info` varchar(255) NOT NULL COMMENT '拓展信息具体值',
  `status` int(11) NOT NULL COMMENT '状态，1，正常；0，被删除',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `updata_time` datetime NOT NULL COMMENT '更新时间',
  `usrid` bigint(20) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for usrtype
-- ----------------------------
DROP TABLE IF EXISTS `usrtype`;
CREATE TABLE `usrtype` (
  `id` bigint(20) NOT NULL COMMENT '用户类型id',
  `typename` varchar(255) NOT NULL COMMENT '类型名称',
  `type_index` int(11) NOT NULL COMMENT '用户类型值',
  `usrid` bigint(20) NOT NULL COMMENT '用户id',
  `status` int(11) NOT NULL COMMENT '状态，1，正常；0，被删除',
  `createtime` datetime NOT NULL COMMENT '创建时间',
  `updatetime` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
