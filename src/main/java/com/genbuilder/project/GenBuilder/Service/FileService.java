package com.genbuilder.project.GenBuilder.Service;

import com.genbuilder.project.GenBuilder.dto.Project.FileContentResponse;
import com.genbuilder.project.GenBuilder.dto.Project.FileNode;

import java.util.List;

public interface FileService {


    List<FileNode> getFileTree(Long projectId, Long userId);

    FileContentResponse getFileContent(Long projectId, String path, Long userId);

}
