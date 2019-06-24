<div>
    <ul>
        <#list statuses as status>
            <div style="margin-bottom: 20px; margin-left: 10%; margin-right: 10%;  background-color: white; border-radius: 25px; border: 1px solid #3F3E3A; padding: 20px; width: auto; height: auto">
                <div style="display: inline-block; width: 90%">
                    <div>
                        <div style="display: inline-block">
                            <img style = "margin-top: 10px; border-radius: 50%; border: 1px solid black; box-shadow: 5px 5px 5px black)" src="${status.user.profileImageURL}">
                        </div>
                        <div style="display: inline-block; margin-top:10px; width: 80%; padding-left: 20px;">
                            <p><b>${status.user.name}</b></p>
                            <p>@${status.user.screenName}</p>
                        </div>
                        <div style="display: inline-block">
                            <img src="images/twitter.png" style="width: 64px; height: 64px">
                        </div>
                    </div>
                    <#if status.hashtagEntities??>
                        <#list status.hashtagEntities as hashtagEntity>
                            #${hashtagEntity.text}
                        </#list>
                    </#if>
                    <p>${status.text}</p>
                    <p>${status.createdAt?datetime}</p>
                    <p>
                        <img src="images/favorite_small.png" style="display: inline-block">
                        <#if status.favouriteCount??>
                            ${status.favouriteCount}
                        </#if>
                        <img src="images/retweet.png" style="display: inline-block">
                        <#if status.retweetCount??>
                            ${status.retweetCount}
                        </#if>
                    </p>
                    <#if status.mediaEntities??>
                        <#list status.mediaEntities as mediaEntity>
                            <p><embed style="size: auto; border-radius: 25px" src="${mediaEntity.mediaURL}" ></p>
                        </#list>
                    </#if>
                  </div>
            </div>
        </#list>
    </ul>
</div>