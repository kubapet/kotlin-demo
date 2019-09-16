package net.czweb.games.codenames.enums

class TopicUrls {
    companion object {
        const val USER_INFO = "/userinfo"
    }
}

enum class Topic(val value: String) {
    UserInfo(TopicUrls.USER_INFO);
}

class EndpointUrls {
    companion object {
        const val GET_USERS = "/getusers/{userId}"
    }
}

enum class Endpoint(val value: String) {
    GetUsers(EndpointUrls.GET_USERS);
}