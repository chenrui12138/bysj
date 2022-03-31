const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot3if68/",
            name: "springboot3if68",
            // 退出到首页链接
            indexUrl: ''
        };
    },
    getProjectName(){
        return {
            projectName: "会议预约系统设计与实现"
        } 
    }
}
export default base
