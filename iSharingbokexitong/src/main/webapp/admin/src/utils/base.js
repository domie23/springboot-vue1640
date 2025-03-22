const base = {
    get() {
        return {
            url : "http://localhost:8080/iSharingbokexitong/",
            name: "iSharingbokexitong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/iSharingbokexitong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "iSharing博客系统"
        } 
    }
}
export default base
