package tavebalak.OTTify.community.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class MyDiscussionDto {
    private Long discussionId;
    private LocalDateTime createdDate;
    private String programTitle;
    private String discussionTitle;
    private String content;
    private String img;
    private int likeCnt;
    private int replyCnt;

    @Builder
    public MyDiscussionDto(Long discussionId, LocalDateTime createdDate, String programTitle, String discussionTitle, String content, String img, int likeCnt, int replyCnt) {
        this.discussionId = discussionId;
        this.createdDate = createdDate;
        this.programTitle = programTitle;
        this.discussionTitle = discussionTitle;
        this.content = content;
        this.img = img;
        this.likeCnt = likeCnt;
        this.replyCnt = replyCnt;
    }
}
