## Blue_blog



#### 介绍

我的毕业设计，我总共把他分为7个模块

- 用户模块主要包含：用户登录、注册、退出登录、查看用户信息、修改用户信息、修改密码、发送手机验证码等。
- 博客模块包含：博客的发布、删除、修改、查看、分享、收藏和点赞。评论模块
- 评论模块包含：评论文章、评论说说、回复评论、查看评论。
- 说说模块包含：发表说说、查看说说、删除说说、修改说说。
- 标签模块包含：记录用户标签，记录文章标签
- 排行榜模块包含：博客的热度排行、浏览量排行
- 私信模块
- 搜索模块



已完成模块：用户模块，博客模块，评论模块，标签模块。

未完成模块：排行榜，私信，搜索，说说（等找到实习再继续完成）



#### 技术栈

##### 前端

- Vue
- 脚手架Vue-cli
- 组件库：element-ui



后端

- SpringBoot框架
- 数据访问层：Mybatis
- 数据库：Mysql，Redis
- 服务器：内置Tomcat （云服务器学生机性能拉跨，自己用得不堪入目就不贴地址了）
- 图片上传：七牛云存储
- 短信服务：腾讯云短信
- 富文本编辑：WangEditor
- 身份验证：JWT



#### 建议版本

- Jdk1.8
- Mysql5.8
- Maven 3.6.1
- Redis随便

#### 快速运行

1. 克隆代码
2. application.properties添加自己的云短信配置，七牛云配置，（配置有问题也可以私信我）
3. 需要数据库表结构可以私信我



#### 目录结构

F:.
│  BlueBlogApplication.java   //启动类
│
├─config
│      AlphaConfig.java   //时间格式配置
│      GlobalCorsConfig.java //配置拦截器跨域问题
│      QiNiuYunConfig.java  //配置七牛云存储图片增删改
│      SwaggerConfig.java  //Swagger配置
│
├─controller
│      BlogShowController.java  //博客首页展示控制层
│      BolgController.java  //博客管理控制层
│      CommentController.java //评论控制层
│      DemoController.java  //demo控制层，不被拦截器拦截
│      LikeController.java //点赞收藏关注控制层
│      LoginController.java //登录控制层
│      TopicController.java //话题控制层
│      UserController.java  //用户信息控制层
│
├─dao                 //数据层
│      BlogMapper.java    //博客数据层
│      CommentMapper.java  //点赞收藏关注数据层
│      ListMapper.java         //首页博客列表数据层
│      SortMapper.java     //排序数据层
│      TopicMapper.java      //话题数据从
│      UserMapper.java      //用户数据层
│
├─entity
│  │  Blog.java    //博客实体
│  │  Comment.java  //回复实体
│  │  Sort.java    //排序实体
│  │  Topic.java  //话题实体
│  │  User.java   //用户实体
│  │
│  ├─Dto   //数据传输需要的实体
│  │      BlogDto.java  
│  │      CommentDto.java
│  │      PageDto.java
│  │
│  └─Vo //前端需要展示的实体
│          BlogListVo.java
│          BlogVo.java
│          CommentVo.java
│          LikeVo.java
│          loginVo.java
│          RegisterVo.java
│          UserVo.java
│
├─service //业务层
│  │  BlogService.java //博客业务层
│  │  CommentService.java//回复业务层
│  │  LikeService.java //点赞，关注，收藏业务层
│  │  ListService.java //首页展示业务层
│  │  SortService.java //排序业务层
│  │  TopicService.java //逻辑业务层
│  │  UserService.java  //用户业务层
│  │
│  └─Impl  //业务层具体实现
│          BlogServiceImpl.java
│          CommentServiceImpl.java
│          LikeServiceImpl.java
│          ListServiceImpl.java
│          SortServiceImpl.java
│          TopicServiceImpl.java
│          UserServiceImpl.java
│
└─util  //工具目录
    │  Base64DecodeMultipartFile.java //将Base64转文件格式，后面没用了
    │  BlogToken.java  //生成Token工具
    │  CommunityUtil.java  //生成随机字符串
    │  GetSetRedis.java  //redis设置各前缀
    │  GetTokenAccountId.java //获得token里的AccountId字段
    │  RandomFour.java //随机生成四位数字验证码
    │  SendSms.java //发送短信工具
    │
    ├─ExceptionHandler
    │      BlogException.java //自定义全局异常类
    │      GlobalExceptionHandler.java //全局异常拦截器
    │
    ├─interceptor
    │      AuthenticationInterceptor.java //拦截器
    │      logininterceptor.java    
    │      WebMvcConfigurer.java //注册拦截器
    │
    └─result
            Result.java //全局统一返回结果类
            ResultCodeEnum.java //统一返回结果状态信息类

